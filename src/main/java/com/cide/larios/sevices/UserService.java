package com.cide.larios.sevices;

import java.util.List;

import com.cide.larios.model.*;
import com.cide.larios.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* UserService
*/
@Service
public class UserService {


	@Autowired
	UserRepository userRepository;


	public Iterable<User> getUsers(){
		return userRepository.findAll();
	}
}
