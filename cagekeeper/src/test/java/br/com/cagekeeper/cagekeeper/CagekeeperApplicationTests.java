package br.com.cagekeeper.cagekeeper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import br.com.cagekeeper.cagekeeper.Usuario;
import br.com.cagekeeper.cagekeeper.dao.NewRepository;

@SpringBootTest
class CagekeeperApplicationTests {
	@Autowired
	private NewRepository repository;
	@Test
	void contextLoads() {
		Usuario user = new Usuario();
		user.setId(2l);
		user.setNome("Joseph Joestar");
		user.setDados("Exemplo dedadosdasdsww");
		user.setPassword("12345");
		Assert.notNull(user.getId());
		repository.save(user);
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}

}
