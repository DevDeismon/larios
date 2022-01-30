package com.cide.larios.DTO;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
* UserDto
*/
public class UserDto {

	@NotBlank(message = "User's email cannot be empty.")
	@Email	
	private String email;

	@NotNull
	private Boolean manager;

	@NotNull(message = "User's name cannot be empty.")
	@Size(min=6, max=30)
	private String name;
	
	@NotNull(message = "User's telefon cannot be empty.")
	@Size(min=9)
	private Integer tel;
	
	@NotNull(message = "User's dni cannot be empty.")
	@Size(min=9)
	private String dni;
	
	@NotNull(message = "User's password cannot be empty.")
	@Size(min = 3)
	private String pass;

	public UserDto (){}

		public String getDni() {
		return dni;
	}
	
	public String getName() {
		return name;
	}
	public Integer getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	public Boolean getManager() {
		return manager;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setTel(Integer tel) {
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
