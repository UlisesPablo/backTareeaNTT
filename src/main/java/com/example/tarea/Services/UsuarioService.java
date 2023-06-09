package com.example.tarea.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.tarea.Entity.Usuario;
import com.example.tarea.Repository.UsuarioRepository;

@Service
@Component
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	public Usuario createUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario getUsuarioById(Long id) {
		Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
		Usuario theUsuario = null;
		
		if(optionalUsuario.isPresent()) {
			theUsuario = optionalUsuario.get();
		}else {
				throw new RuntimeException("No se encuentra registrado el Usuario");
		}
		return theUsuario;
	}
	
	public List<Usuario> getAllUsuario(){
		return usuarioRepository.findAll();
	}
	
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	
	
	
	
	
	//private final UsuarioRepository usuarioRepository;
	
	//@Autowired
	//public UsuarioService(UsuarioRepository usuarioRepository) { 
	//	this.usuarioRepository = usuarioRepository;	}
	
	
	
	//public boolean UsuarioExiste(int id) {
	//	return usuarioRepository.existsById(id);}
	
	//public Usuario crearUsuario(Usuario usuario) {
//		return usuarioRepository.save(usuario);	}
	

}
