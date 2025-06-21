package com.blog.apis.services;

import java.util.List;

import com.blog.apis.payloads.CategoryDto;

public interface CategoryService {
	
	
	// create
	
	CategoryDto createCategory(CategoryDto categoryDto);
	
	
	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	
	// delete
	
	void deleteCategory(Integer categoryId);
	
	// get
	
	CategoryDto getCategory(Integer categoryId);
	
	// getAll
	
	List<CategoryDto> getCategories();

}
