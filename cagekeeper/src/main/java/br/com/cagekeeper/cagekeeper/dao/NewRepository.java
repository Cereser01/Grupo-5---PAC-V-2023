package br.com.cagekeeper.cagekeeper.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.cagekeeper.cagekeeper.Usuario;

@Repository
public interface NewRepository extends CrudRepository<Usuario, Long> {
    
}
