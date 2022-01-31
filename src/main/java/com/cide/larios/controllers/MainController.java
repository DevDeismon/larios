package com.cide.larios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
/**
* MainController
* Clase encargada de recoger cualquier solicitud de redirect por metodo Get y realizar la correspondiente redirección.
* Por ejemplo: Un boton que envia el usuario a ver la mesas del local.
*/
@Controller
public class MainController {
 
	@GetMapping("/redirect")
	public String redirect(@RequestParam("url") String url){
		return "redirect:".concat(url);
	}
}
