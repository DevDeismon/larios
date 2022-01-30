package com.cide.larios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
/**
* User
*/
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotBlank
	@Email
	private String email; 
	private Boolean manager;
	@NotBlank
	@Size(min = 2, message = "El nombre a de contener como minimo 2 caracteres")
	private String name;
	@NotEmpty
	@Size(min = 9, message = "El telefono a de contener como minimo 9 digitos")
	private String tel;
	@NotBlank
	@Size(min = 9, message = "El DNI debe contener 9 digitos y una letra")
	private String dni;
	@NotBlank
	@Size(min = 8, message = "La contraseña debe tener como minimo 8 caracteres o digitos")
	private String pass;

	public User(){}

	public String getDni() {
		return dni;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	public Boolean getManager() {
		return manager;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setManager(Boolean manager) {
		this.manager = manager;
	}
	public String getPass() {
			return pass;
	}
	public void setPass(String pass) {
			this.pass = pass;
	}
	
	@Override
	public String toString(){
	
		return String.format("User[name=%s, dni=%s, email=%s, tel=%d, pass=%s]", name,dni,email,tel,pass);
	}
}
