package br.com.cagekeeper.cagekeeper.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.cagekeeper.cagekeeper.Usuario;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
	
    
}
