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
		user.setId(6l);
		user.setNome("Eduardo_Morias");
		user.setDados("Eu_gosto_de_todos");
		user.setPassword("vacasnegrasdaoleite");
		repository.save(user);
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getDados());
	}
}
