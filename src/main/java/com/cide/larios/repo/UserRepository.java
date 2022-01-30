package com.cide.larios.repo;

import org.springframework.data.repository.CrudRepository;
import com.cide.larios.model.User;
/**
* UserRepository
*/
public interface UserRepository extends CrudRepository <User,Integer>{

	User findByEmail(String email);
	User findByPass(String password);
}
