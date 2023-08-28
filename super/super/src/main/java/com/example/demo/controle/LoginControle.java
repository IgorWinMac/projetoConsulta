/*

package com.example.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.modelo.Administrador;
import com.example.demo.modelo.Paciente;
import com.example.demo.repositorio.AdministradorRepositorio;

@Controller
public class LoginControle {
	
	@Autowired
	private AdministradorRepositorio acoes;
	
	@GetMapping("/login")
	public String login(Paciente paciente) {
		return "/login";
	}
	
	@PostMapping("/logar")
	public String logar(Model model, Administrador admParam) {
		Administrador adm = (Administrador) this.acoes.findAllLogin(admParam.getNome(), admParam.getSenha());
		if(adm !=null) {
			return "redirect:/";
		}
		model.addAttribute("erro", "Usuário ou Senha Inválidos!");
		return "/login";
	}
		
}
*/

