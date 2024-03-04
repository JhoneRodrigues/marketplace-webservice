package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.Order;
import com.jhonerodrigues.springbootjpa.repositories.OrderRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById (Long id) {
		Order obj = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id));
		return obj;
	}
}	
