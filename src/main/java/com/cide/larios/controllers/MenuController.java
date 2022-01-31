package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* MenuController
*/
@Controller
public class MenuController {
	
	@GetMapping("/menu")
	public String showMenu(){
		return "menu";
	}
}
