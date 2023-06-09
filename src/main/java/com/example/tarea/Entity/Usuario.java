package com.example.tarea.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	@Column(name="name")
	private String name;
	
	@Column(name="emeal")
	private String emeal;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phones")
	private int phones ;
	
	
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
	public int getPhones() {
		return phones;
	}
	public void setPhones(int phones) {
		this.phones = phones;
	}

	
	public Usuario(String name, String emeal, String password, int phones) {
		
		this.name = name;
		this.emeal = emeal;
		this.password = password;
		this.phones = phones;
	}
	
	

	
}
