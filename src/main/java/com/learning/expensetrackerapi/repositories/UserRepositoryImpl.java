package com.learning.expensetrackerapi.repositories;

import com.learning.expensetrackerapi.entity.User;
import com.learning.expensetrackerapi.exception.EtAuthException;

public class UserRepositoryImpl implements UserRepository {

	@Override
	public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmailAndPassword(String email, String password) throws EtAuthException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCountByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
