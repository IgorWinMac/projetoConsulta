/*
package com.example.demo.controle;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;

public class UsuarioControle {
	
	@Autowired
	private UsuarioRepositorio action;
	
	@GetMapping("/usuario")
	public String listarUsuarios(@PathVariable long id, Model model) {
		Optional<Usuario> usuario = action.findById(id);
		return "usuarios";
	}

}
*/