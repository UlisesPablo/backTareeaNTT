package com.example.tarea.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tarea.Entity.Usuario;
import com.example.tarea.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) { 
		this.usuarioRepository = usuarioRepository;
		
		}
	public boolean UsuarioExiste(String name) {
		return usuarioRepository.existsByName(name);
		
	}
	
	public Usuario crearUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	

}
