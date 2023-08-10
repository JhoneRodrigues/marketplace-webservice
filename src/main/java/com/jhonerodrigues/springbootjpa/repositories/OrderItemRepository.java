package com.jhonerodrigues.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonerodrigues.springbootjpa.entities.OrderItem;

//O proprio JPA implementa essa interface
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
