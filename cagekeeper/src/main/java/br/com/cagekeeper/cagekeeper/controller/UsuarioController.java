package br.com.cagekeeper.cagekeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.cagekeeper.cagekeeper.dao.UsuarioRepository;
@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	

	//@GetMapping("formulario")
	/*public String formulario(RequisicaoNovoUsuario requisicaoNovoUsuario, Model model) {
		
		return "funcionario/formulario";
	}*/
	
	/*@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoFuncionario requisicaoNovoFuncionario, BindingResult result) {
		if(result.hasErrors()) {
			return "funcionario/formulario";
		} else {
			Funcionario f = requisicaoNovoFuncionario.toFuncionario(cargoRepository);
			this.funcionarioRepository.save(f);
			return "redirect:/home";
		}
	}*/	
}
