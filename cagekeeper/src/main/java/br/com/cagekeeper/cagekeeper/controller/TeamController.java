package br.com.cagekeeper.cagekeeper.controller;
import br.com.cagekeeper.cagekeeper.Usuario;
import br.com.cagekeeper.cagekeeper.dao.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/team")
public class TeamController {
    @Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public String team(Model model) {
		List<Usuario> usuarios = (List<Usuario>) repository.findAll(Sort.unsorted());
		model.addAttribute("usuarios", usuarios);
		return "team";
	}
}
