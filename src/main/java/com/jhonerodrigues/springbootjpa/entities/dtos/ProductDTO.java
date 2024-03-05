package com.jhonerodrigues.springbootjpa.entities.dtos;

import java.util.Set;

import com.jhonerodrigues.springbootjpa.entities.Category;
import com.jhonerodrigues.springbootjpa.entities.Product;

public record ProductDTO(Long id, String name, String description, 
		Double price, String imgUrl, Set <Category> categories) {
		
	public ProductDTO(Product obj) {
		this(obj.getId(),obj.getName(),obj.getDescription(),
				obj.getPrice(),obj.getImgUrl(),obj.getCategories());
	}
}
