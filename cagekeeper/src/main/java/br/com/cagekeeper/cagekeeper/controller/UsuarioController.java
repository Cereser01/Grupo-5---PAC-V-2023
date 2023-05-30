package br.com.cagekeeper.cagekeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.cagekeeper.cagekeeper.dao.NewRepository;
@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private NewRepository usuarioRepository;
	
}
