package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.Product;
import com.jhonerodrigues.springbootjpa.repositories.ProductRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById (Long id) {
		Product obj = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id));
		return obj;
	}
}	
