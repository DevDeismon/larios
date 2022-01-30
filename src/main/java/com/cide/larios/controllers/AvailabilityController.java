package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* AvailabilityController
*/
@Controller
public class AvailabilityController {

	@GetMapping("/availability")
	public String showAvailability(){
		return "availability";	
	}
}
