package com.jhonerodrigues.springbootjpa.entities.dtos;

import java.util.Set;

import com.jhonerodrigues.springbootjpa.entities.Category;
import com.jhonerodrigues.springbootjpa.entities.Product;

public record CategoryDTO(Long id, String name, Set <Product> products) {

	public CategoryDTO(Category entity) {
		this(entity.getId(),entity.getName(),entity.getProducts());
	}
}
