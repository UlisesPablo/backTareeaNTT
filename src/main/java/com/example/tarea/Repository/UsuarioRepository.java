package com.example.tarea.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tarea.Entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	
	//Usuario findById(int id);
	//boolean existsById (int id);
	
	//Usuario save(Usuario usuario);

}



