package br.com.cagekeeper.cagekeeper;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.notNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TesteUsuario {
    @Test
    public static void usuarioSalvaTest() {
		Usuario user = new Usuario();
		user.setNome("Joseph Joestar");
		user.setDados("Exemplo dedadosdasdsww");
		user.setPassword("12345");
		assertNotNull(user.getId());
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}
}
