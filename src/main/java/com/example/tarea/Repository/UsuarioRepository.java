package com.example.tarea.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tarea.Entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String> {
	
	Usuario findByName(String name);
	boolean existsByName (String name);
	
	Usuario save(Usuario usuario);

}



