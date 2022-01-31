package com.cide.larios.controllers;


import com.cide.larios.sevices.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
* ToAssingController
* Clase encargada de gestionar que mesas tienen un camarero asignado.
*/
@Controller
public class ToAssingController {

	@Autowired
	UserService userService;
	
	//Metodo encargado de recoger la petición /login por metodo Get y mostrar la correspondiente vista
	@GetMapping("/toAssing")
	public String showToAssing(Model model){
		model.addAttribute("users",userService.getUsers());
		return "toAssing";
	}

}
