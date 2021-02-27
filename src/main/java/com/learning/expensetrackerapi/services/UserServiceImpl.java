package com.learning.expensetrackerapi.services;

import org.springframework.stereotype.Service;

import com.learning.expensetrackerapi.entity.User;
import com.learning.expensetrackerapi.exception.EtAuthException;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User validateUser(String email, String password) throws EtAuthException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
		// TODO Auto-generated method stub
		return null;
	}

}
