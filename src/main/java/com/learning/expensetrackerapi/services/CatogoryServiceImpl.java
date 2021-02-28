package com.learning.expensetrackerapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.expensetrackerapi.entity.Category;
import com.learning.expensetrackerapi.exception.EtBadRequestException;
import com.learning.expensetrackerapi.exception.EtResourceNotFoundException;
import com.learning.expensetrackerapi.repositories.CategoryRepository;

@Service
@Transactional
public class CatogoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> fetchAllCategories(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
