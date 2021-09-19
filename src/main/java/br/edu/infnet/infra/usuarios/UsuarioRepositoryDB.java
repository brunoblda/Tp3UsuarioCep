package br.edu.infnet.infra.usuarios;

/**
 *
 * @author bruno
 */
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.domain.usuarios.Usuario;

@Repository
public interface UsuarioRepositoryDB extends CrudRepository<Usuario, Integer> {

	public List<Usuario> findAll(Sort sort);

}