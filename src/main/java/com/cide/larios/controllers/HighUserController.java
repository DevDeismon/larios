package com.cide.larios.controllers;


import com.cide.larios.repo.*;
import com.cide.larios.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
* HighUserController
* Clase encargada de recoger los datos introducidos por el usuario(Manager) validarlos y crear un registro en la DB.
*/
@Controller
public class HighUserController {
	
	private UserRepository userRepository;
	
	//El constructor de la clase se encarga de inicializar la variable userRepository para poder hacer operaciones de DB.
	@Autowired
	public HighUserController(UserRepository userRepository){
		this.userRepository=userRepository;
	}
	
	
	//Metodo encargado de recoger la petición /login por metodo Get y mostrar la correspondiente vista
	@GetMapping("/highUser")
	public String showHighUser(User user){
		return "highUser";	
	}
	
	//Metodo encargado de recoger los datos introducidos por el encargado validarlos e insertar un nuevo usuario en la DB.
	@PostMapping("/highUser")
	public String addUser(@Validated User user, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return "highUser";
		}else{
			userRepository.save(user);
			return "/main";
		}
	}
}
