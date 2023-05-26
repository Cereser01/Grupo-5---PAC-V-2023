package br.com.cagekeeper.cagekeeper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.cagekeeper.cagekeeper.dao.NewRepository;


@SpringBootTest
public class TesteUsuario {
	@Autowired
	private NewRepository repository;
    @Test
    public void usuarioSalvaTest() {
		Usuario user = new Usuario();
		user.setNome("Joseph Joestar");
		user.setDados("Exemplo dedadosdasdsww");
		user.setPassword("12345");
		repository.save(user);
		assertNotNull(user.getId());
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}
}
