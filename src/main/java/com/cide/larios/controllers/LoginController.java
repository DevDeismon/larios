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
* Clase encargada de redirigir a los usuarios a la vista corespondiente según si es Encagado(Manager) o Camarero.
*/
@Controller
public class LoginController {
	private UserRepository userRepository; 
	//El constructor de la clase se encarga de inicializar la variable userRepository para poder hacer operaciones de DB.
	@Autowired
	public LoginController(UserRepository userRepository){
		this.userRepository=userRepository;
	}
	//Metodo encargado de recoger la petición /login por metodo Get y mostrar la correspondiente vista
	@GetMapping("/login")
	public String loginForm(Model model){
		model.addAttribute("user", new User());
		return "login";
	}
	/**
	 * Metodo encargado de recoger por metodo Post los datos introducidos por el usuario y validar que sean correctos.
	 * En caso de ser correctos se comprueba si en un encargado o no y redirigimos al usuario a su correspondiente vista.
	*/
	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute User user, Model model){
		String pass=user.getPass();
		User u=userRepository.findByEmail(user.getEmail());
		if (u!=null) {
			if (u.getPass().equals(pass)) {
				if(u.getManager()){
					return "/main";
				}else{
					return "/mainUser";
				}
			}	
		}
		return "login";
	}
}
