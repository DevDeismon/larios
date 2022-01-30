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
*/
@Controller
public class HighUserController {

	private UserRepository userRepository;
	@Autowired
	public HighUserController(UserRepository userRepository){
		this.userRepository=userRepository;
	}


	@GetMapping("/highUser")
	public String showHighUser(User user){
		return "highUser";	
	}

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
