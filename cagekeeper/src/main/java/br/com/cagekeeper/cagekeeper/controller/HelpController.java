package br.com.cagekeeper.cagekeeper.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cagekeeper.cagekeeper.Usuario;
import br.com.cagekeeper.cagekeeper.dao.UsuarioRepository;

@Controller
@RequestMapping("/help")
public class HelpController {
    @Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public String help(Model model) {
		List<Usuario> usuarios = (List<Usuario>) repository.findAll(Sort.unsorted());
		model.addAttribute("usuarios", usuarios);
		return "help";
	}
    
}
