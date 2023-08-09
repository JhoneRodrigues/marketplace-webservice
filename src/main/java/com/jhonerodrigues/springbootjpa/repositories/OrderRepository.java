package com.jhonerodrigues.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonerodrigues.springbootjpa.entities.Order;

//O proprio JPA implementa essa interface
public interface OrderRepository extends JpaRepository<Order, Long>{

}
