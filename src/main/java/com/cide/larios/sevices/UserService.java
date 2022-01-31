package com.cide.larios.sevices;


import com.cide.larios.model.*;
import com.cide.larios.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* UserService
* Esta clase ofrece metodos para poder agilizar el flujo de trabajo y evitar repetir codigo en distintos puntos del programa
*/
@Service
public class UserService {


	@Autowired
	UserRepository userRepository;


	public Iterable<User> getUsers(){
		return userRepository.findAll();
	}
}
