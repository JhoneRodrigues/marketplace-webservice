package com.jhonerodrigues.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonerodrigues.springbootjpa.entities.User;

//O proprio JPA implementa essa interface
public interface UserRepository extends JpaRepository<User, Long>{

}
