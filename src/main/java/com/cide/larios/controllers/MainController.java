package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
/**
* MainController
*/
@Controller
public class MainController {

	@GetMapping("/redirect")
	public String redirect(@RequestParam("url") String url){
		return "redirect:".concat(url);
	}
}
