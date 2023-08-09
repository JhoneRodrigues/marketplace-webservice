package com.jhonerodrigues.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonerodrigues.springbootjpa.entities.Category;

//O proprio JPA implementa essa interface
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
