package com.example.tarea.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import com.example.tarea.Entity.Usuario;
import com.example.tarea.Repository.UsuarioRepository;
import com.example.tarea.Services.UsuarioService;


@RestController
@RequestMapping("/apiUsuarios")
@AllArgsConstructor
public class UsuarioController {
	
	@Autowired	
	private UsuarioService usuarioService;
	
	@PostMapping
	public Usuario createUser(@RequestBody Usuario usuario) { 
		return usuarioService.createUsuario(usuario);
	}
	
	@GetMapping
	public List<Usuario> getAllUsuario(){
		return usuarioService.getAllUsuario();	
	}
	
	@GetMapping("{id}")
	public Usuario searchUsuarioById(@PathVariable("id") Long id) {
		return usuarioService.getUsuarioById(id);
	}
	
	@DeleteMapping("{id}")
	public void deleteUsuarioById(@PathVariable("id") Long id) {
		 usuarioService.deleteUsuario(id);
	}
		
	
	
	
	
	
	
	//@PostMapping("/crear")
	//public Usuario crearUsuario(@RequestBody Usuario usuario) {
	//	return usuarioService.crearUsuario(usuario); }
	
	//@GetMapping("/{id}/existe")
	//public boolean getUsuario(@PathVariable int id) {
	//	return (boolean) usuarioService.UsuarioExiste(id);}
	   
}
