package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
* TablesController
* Clase encargada de mostrar el mapa de mesas del restaurante
*/
@Controller
public class TablesController {
	
	@GetMapping("/tables")
	public String showTables(){
		return "tables";
	}
}
