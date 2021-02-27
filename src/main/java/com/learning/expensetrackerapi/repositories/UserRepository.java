package com.learning.expensetrackerapi.repositories;

import com.learning.expensetrackerapi.entity.User;
import com.learning.expensetrackerapi.exception.EtAuthException;

public interface UserRepository {
	Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
	
	User findByEmailAndPassword(String email, String password) throws EtAuthException;
	
	Integer getCountByEmail(String email);
	
	User findById(Integer userId);
}
