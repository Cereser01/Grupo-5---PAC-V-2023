package br.com.cagekeeper.CageKeeper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

@SpringBootApplication
public class CageKeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(CageKeeperApplication.class, args);
		usuarioSalvaTest();
	}
	public static void usuarioSalvaTest() {
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
