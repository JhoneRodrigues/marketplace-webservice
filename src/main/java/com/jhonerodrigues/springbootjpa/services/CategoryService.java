package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.Category;
import com.jhonerodrigues.springbootjpa.repositories.CategoryRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById (Long id) {
		Category obj = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id));
		return obj;
	}
}	
