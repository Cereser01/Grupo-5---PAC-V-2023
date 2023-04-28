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
	public void usuarioSalvaTest() {
		Dados data = new Dados();
		List lista = new ArrayList<>();
		lista.add("Senha 1");
		lista.add("Senha 2");
		data.setDados(lista);
		Usuario user = new Usuario();
		user.setNome("Joseph Joestar");
		user.setDados(data);
		user.setPassword("12345");
		Assert.isTrue(user.getId() != null);
	}
}
