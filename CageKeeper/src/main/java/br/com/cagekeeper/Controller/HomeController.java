package br.com.cagekeeper.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cagekeeper.CageKeeper.Usuario;
import br.com.cagekeeper.dao.UsuarioRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public String home(Model model) {
		List<Usuario> usuarios = (List<Usuario>) repository.findAll();
		model.addAttribute("usuarios", usuarios);
		return "home";
	}
}