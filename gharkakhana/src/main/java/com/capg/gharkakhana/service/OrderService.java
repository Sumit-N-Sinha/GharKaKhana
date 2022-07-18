package com.capg.gharkakhana.service;

import org.springframework.stereotype.Service;

import com.capg.gharkakhana.entity.Order;

@Service
public interface OrderService {
	public Order createOrder(Order order);
	public void cancelOrder();
	public void deleteOrder(int orderId);
	public Order updateOrder(int id, Order order);
	public Order viewOrder(int oid);

}
