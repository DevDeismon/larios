package com.cide.larios.controllers;


import com.cide.larios.sevices.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
* ToAssingController
*/
@Controller
public class ToAssingController {

	@Autowired
	UserService userService;

	@GetMapping("/toAssing")
	public String showToAssing(Model model){
		model.addAttribute("users",userService.getUsers());
		return "toAssing";
	}

}
