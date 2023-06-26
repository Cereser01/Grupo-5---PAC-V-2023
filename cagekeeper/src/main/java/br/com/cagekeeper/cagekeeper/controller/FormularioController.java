package br.com.cagekeeper.cagekeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cagekeeper.cagekeeper.Usuario;
import br.com.cagekeeper.cagekeeper.dao.NewRepository;
import br.com.cagekeeper.cagekeeper.dao.UsuarioRepository;
import br.com.cagekeeper.cagekeeper.dto.RequisicaoNovoUsuario;

@Controller
@RequestMapping("")
public class FormularioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private NewRepository newRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovoUsuario requisicaoNovoUsuario, Model model){
        model.addAttribute("usuarios", newRepository.findAll());
        return "/formulario";
    }
    @PostMapping("novo")
    public String novo(@Validated RequisicaoNovoUsuario requisicaoNovoUsuario, BindingResult result){
        if(result.hasErrors()){
            return "/formulario";
        } else{
            Usuario f = requisicaoNovoUsuario.toUsuario(newRepository);
            this.newRepository.save(f); //ver se da certo, no exemplo do vitazik ele usa um page and sorting repository
            //basicamente 
            return "redirect:/home";
        }
    }

}
