package com.learning.expensetrackerapi.services;

import com.learning.expensetrackerapi.entity.User;
import com.learning.expensetrackerapi.exception.EtAuthException;

public interface UserService {
	User validateUser(String email, String password) throws EtAuthException;
	
	User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
