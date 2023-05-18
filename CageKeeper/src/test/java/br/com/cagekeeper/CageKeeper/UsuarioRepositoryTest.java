package br.com.cagekeeper.CageKeeper;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import br.com.cagekeeper.dao.UsuarioRepository;

@SpringBootTest
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public static void usuarioSalvaTest() {
		Usuario user = new Usuario();
		user.setNome("Joseph Joestar");
		user.setDados("Exemplo dedadosdasdsww");
		user.setPassword("12345");
		Assert.isTrue(user.getId() != null);
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}	
	
}
