package br.com.cagekeeper.cagekeeper.dao;

import org.springframework.data.jpa.domain.Specification;
import br.com.cagekeeper.cagekeeper.Usuario;

public class SpecificationUsuario {
    public static Specification<Usuario> nome(String nome){
		return (root, criteriaQuery, criteriaBuilder) ->
				criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
	}
	
}
