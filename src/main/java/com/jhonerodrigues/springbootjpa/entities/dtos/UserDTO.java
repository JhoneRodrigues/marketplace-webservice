package com.jhonerodrigues.springbootjpa.entities.dtos;

import java.util.List;

import com.jhonerodrigues.springbootjpa.entities.Order;
import com.jhonerodrigues.springbootjpa.entities.User;

public record UserDTO(Long id, String name, String email, 
		String phone, String password, List<Order> orders) {
	
	public UserDTO(User obj) {
		this(obj.getId(),obj.getName(),obj.getEmail(),
				obj.getPhone(),obj.getPassword(),obj.getOrders());
	}
}