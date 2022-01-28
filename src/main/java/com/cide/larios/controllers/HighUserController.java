package com.cide.larios.controllers;

import javax.validation.Valid;

import com.cide.larios.dataAccess.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String showHighUser(Model model){
		model.addAttribute("user", new User());
		return "highUser";	
	}

	@PostMapping("/highUser")
	public String addUser(@Valid @ModelAttribute User user, BindingResult bindingResult){
		System.out.println(bindingResult.hasErrors());
		if (bindingResult.hasErrors()) {
			System.err.println("Error al introducir los datos!");
			return "highUser";
		}else{
			System.out.println("Add user on data base"+user.toString());
			userRepository.save(user);	
			return "highUser";
		}
	}
}
