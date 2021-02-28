package com.learning.expensetrackerapi.services;

import java.util.List;

import com.learning.expensetrackerapi.entity.Category;
import com.learning.expensetrackerapi.exception.EtBadRequestException;
import com.learning.expensetrackerapi.exception.EtResourceNotFoundException;

public interface CategoryService {
	
	List<Category> fetchAllCategories(Integer userId);
	
	Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
	
	Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;
	
	void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
	
	void removeCategory(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
