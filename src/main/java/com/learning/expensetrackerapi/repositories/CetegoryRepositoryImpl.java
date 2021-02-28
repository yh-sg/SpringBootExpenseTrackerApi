package com.learning.expensetrackerapi.repositories;

import java.util.List;

import com.learning.expensetrackerapi.entity.Category;
import com.learning.expensetrackerapi.exception.EtBadRequestException;
import com.learning.expensetrackerapi.exception.EtResourceNotFoundException;

public class CetegoryRepositoryImpl implements CategoryRepository {

	@Override
	public List<Category> findAll(Integer userId) throws EtResourceNotFoundException {
		return null;
	}

	@Override
	public Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
		return null;
	}

	@Override
	public Integer create(Integer userId, String title, String description) throws EtBadRequestException {
		return null;
	}

	@Override
	public void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {
		
	}

	@Override
	public void removeById(Integer userId, Integer categoryId) {
		
	}

}
