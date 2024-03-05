package com.jhonerodrigues.springbootjpa.entities.dtos;

import java.time.Instant;
import java.util.Set;

import com.jhonerodrigues.springbootjpa.entities.Order;
import com.jhonerodrigues.springbootjpa.entities.OrderItem;
import com.jhonerodrigues.springbootjpa.entities.Payment;
import com.jhonerodrigues.springbootjpa.entities.User;
import com.jhonerodrigues.springbootjpa.entities.enums.OrderStatus;

public record OrderDTO(Long id, Instant moment, OrderStatus orderStatus, 
		User client, Set <OrderItem> itens, Payment payment) {
	
	public OrderDTO(Order obj) {
		this(obj.getId(),obj.getMoment(),obj.getOrderStatus(),
				obj.getClient(),obj.getItens(),obj.getPayment());
	}
}
