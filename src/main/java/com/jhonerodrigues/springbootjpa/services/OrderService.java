package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.dtos.OrderDTO;
import com.jhonerodrigues.springbootjpa.repositories.OrderRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<OrderDTO> findAll(){
		return repository.findAll().stream()
				.map(x -> new OrderDTO(x)).toList();
	}
	
	public OrderDTO findById (Long id) {
		return new OrderDTO(repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id)));
	}
}	
