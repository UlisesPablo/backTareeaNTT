package com.example.tarea.Entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Entity
@Table(name= "usuario")
@Data
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	private String emeal;
	
	private String password;
	
	private List<String> phones ;	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmeal() {
		return emeal;
	}
	public void setEmeal(String emeal) {
		this.emeal = emeal;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Usuario(Long id, String name, String emeal, String password, List<String> phones) {
		super();
		this.id = id;
		this.name = name;
		this.emeal = emeal;
		this.password = password;
		this.phones = phones;
	}
	public Usuario() {
		super();
	}
	
	

	
}
