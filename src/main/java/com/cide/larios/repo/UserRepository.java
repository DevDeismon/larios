package com.cide.larios.repo;

import org.springframework.data.repository.CrudRepository;
import com.cide.larios.model.User;
/**
* UserRepository
* Esta clase es una interfaz que extiende de CrudRepository y se encarga de gestionar el flujo de entradas y salidas de datos de la DB.
*/
public interface UserRepository extends CrudRepository <User,Integer>{

	User findByEmail(String email);
	User findByPass(String password);
}
