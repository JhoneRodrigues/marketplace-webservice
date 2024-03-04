package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.dtos.CategoryDTO;
import com.jhonerodrigues.springbootjpa.repositories.CategoryRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<CategoryDTO> findAll(){
		return repository.findAll().stream()
				.map(x -> new CategoryDTO(x)).toList();
	}
	
	public CategoryDTO findById (Long id) {
		CategoryDTO dto = new CategoryDTO(repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id)));
		return dto;
	}
}	
