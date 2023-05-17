package br.com.cagekeeper.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.cagekeeper.CageKeeper.Usuario;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
	List<Usuario> findByNome(String nome);

	@Query(value="Select a.id, a.nome, from Usuario a ", 
			nativeQuery=true)
	List<UsuarioProjecao> listUsuarioProjecao();
}
