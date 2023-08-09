package com.jhonerodrigues.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonerodrigues.springbootjpa.entities.Product;

//O proprio JPA implementa essa interface
public interface ProductRepository extends JpaRepository<Product, Long>{

}
