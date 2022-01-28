package com.cide.larios.dataAccess;

import org.springframework.data.repository.CrudRepository;

/**
* UserRepository
*/
public interface UserRepository extends CrudRepository <User,Integer>{

	User findByEmail(String email);
	User findByPass(String password);
}
