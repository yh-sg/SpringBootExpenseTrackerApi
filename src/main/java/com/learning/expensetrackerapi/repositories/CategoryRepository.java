package com.learning.expensetrackerapi.repositories;

import java.util.List;

import com.learning.expensetrackerapi.entity.Category;
import com.learning.expensetrackerapi.exception.EtBadRequestException;
import com.learning.expensetrackerapi.exception.EtResourceNotFoundException;

public interface CategoryRepository {
	
	List<Category> findAll(Integer userId) throws EtResourceNotFoundException;
	
	Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
	
	Integer create(Integer userId, String title, String description) throws EtBadRequestException;
	
	void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
	
	void removeById(Integer userId, Integer categoryId);
}
