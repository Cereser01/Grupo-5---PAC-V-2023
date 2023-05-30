package br.com.cagekeeper.cagekeeper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import br.com.cagekeeper.cagekeeper.dao.NewRepository;




@SpringBootTest
public class TesteUsuario {
	@Autowired
	private NewRepository repository;
    @Test
    public void usuarioSalvaTest() {
		Usuario user = new Usuario();
		user.setId(2l);
		user.setNome("Joseph_Joestar");
		user.setDados("12345");
		user.setPassword("12345");
		repository.save(user);
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}
}
