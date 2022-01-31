package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* MenuController
* Clase encargada de realizar todas las operaciones necesarias para completar una comanda.
*/
@Controller
public class MenuController {
	
	//Metodo encargado de recoger la petición /login por metodo Get y mostrar la correspondiente vista
	@GetMapping("/menu")
	public String showMenu(){
		return "menu";
	}
}
