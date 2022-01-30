package com.cide.larios.controllers;
import com.cide.larios.repo.UserRepository;
import com.cide.larios.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
* LoginController
*/
@Controller
public class LoginController {
	private UserRepository userRepository;

	@Autowired
	public LoginController(UserRepository userRepository){
		this.userRepository=userRepository;
	}

	@GetMapping("/login")
	public String loginForm(Model model){
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute User user, Model model){
		String pass=user.getPass();
		User u=userRepository.findByEmail(user.getEmail());
		if (u!=null) {
			if (u.getPass().equals(pass)) {
				return "/main";
			}	
		}
		return "login";
	}
}
