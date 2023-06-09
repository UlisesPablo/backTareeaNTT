package com.example.tarea.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
		
	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) { 
		this.usuarioService = usuarioService;
		
		}
	
	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioService.crearUsuario(usuario); 
	}
	
	@GetMapping("/{name}/existe")
	public boolean getUsuario(@PathVariable String name) {
		return (boolean) usuarioService.UsuarioExiste(name);
	}
	
}
