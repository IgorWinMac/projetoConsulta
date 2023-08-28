
package com.example.demo.controle;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.modelo.Paciente;
import com.example.demo.repositorio.PacienteRepositorio;

@Controller
public class PacienteControle {
	
	@Autowired
	private PacienteRepositorio acoes;
	
	@GetMapping("/inicio")
	public String paginaPrincipal() {
		return "index";
	}
	
	@GetMapping("/sobre")
	public String paginaSobre() {
		return "sobre";
	}
	
	@GetMapping("/paciente")
	public String listarPacientes(Model model) {
		List<Paciente> pacientes = acoes.findAll();
		model.addAttribute("pacientes", pacientes);
		return "logar";
	}
	@GetMapping("/")
	public String lista(Model model) {
		List<Paciente> pacientes = acoes.findAll();
		model.addAttribute("pacientes", pacientes);
		return "logar";
	}
		
	@GetMapping("/logar_paciente")
	public String paginaLogarPaciente(Paciente paciente){
		return "logar_paciente";
	}
		
	@GetMapping("/cadastrarPaciente")
	public String paginaAdicionarPaciente(Paciente paciente) {
		return "adicionar_paciente";
	}
	
	@PostMapping("/adicionarPaciente")
	public String adicionaPaciente(@Valid Paciente paciente, 
			Errors erros, BindingResult result, Model model) {
		if(result.hasErrors() || (null != erros && erros.getErrorCount() > 0)) {
			return "adicionar_paciente";
		}
		acoes.save(paciente);
		return "redirect:/paciente";
	}
	
	@GetMapping("/editar/{id}")
	public String paginaAtualizarPaciente(
			@PathVariable("id") long id, Model model) {
		Paciente paciente = acoes.findById(id)
				.orElseThrow(() -> 
				new IllegalArgumentException("Identificador do paciente é inválido" + id));
		
		model.addAttribute("paciente", paciente);
		return "editar_paciente";
	}
	
	@PostMapping("/atualizar/{id}")
	public String atualizarPaciente(@PathVariable("id") long id,
			@Valid Paciente paciente, BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			paciente.setId(id);
			return "editar_paciente";
		}
		acoes.save(paciente);
		return "redirect:/paciente";
	}
	
	@GetMapping("/delete/{id}")
	public String deletarPaciente(
			@PathVariable("id") long id, Model model) {
		Paciente paciente = acoes.findById(id)
				.orElseThrow(()-> 
				new IllegalArgumentException("Identificador do paciente inválido" + id));
		acoes.delete(paciente);
		return "redirect:/paciente";
	}
}
