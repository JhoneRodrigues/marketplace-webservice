package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.dtos.ProductDTO;
import com.jhonerodrigues.springbootjpa.repositories.ProductRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<ProductDTO> findAll(){
		return repository.findAll().stream()
				.map(x -> new ProductDTO(x)).toList();
	}
	
	public ProductDTO findById (Long id) {
		return new ProductDTO (repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id)));
	}
}	
