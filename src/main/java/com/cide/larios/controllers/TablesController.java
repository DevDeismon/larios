package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
/**
* TablesController
*/
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TablesController {
	
	@GetMapping("/tables")
	public String showTables(){
		return "tables";
	}
}
