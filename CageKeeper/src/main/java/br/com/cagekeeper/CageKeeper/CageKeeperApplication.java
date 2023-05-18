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
		Usuario user = new Usuario();
		user.setNome("Joseph Joestar");
		user.setDados("Exemplo dedadosdasdsww");
		user.setPassword("12345");
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}
}
