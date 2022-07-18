package com.capg.gharkakhana.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.gharkakhana.dto.OrderDTO;
import com.capg.gharkakhana.entity.Order;
import com.capg.gharkakhana.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public void cancelOrder() {
		
	}

	@Override
	public void deleteOrder(int orderId) {
		Optional<Order> optional = orderRepository.findById(orderId);
		if(optional.isPresent()) {
			orderRepository.deleteById(orderId);
		}
	}

	@Override
	public Order updateOrder(int id, Order order) {
		if(orderRepository.findById(id).isPresent()) {
			Order o = orderRepository.findById(id).get();
			o.setItems(order.getItems());
			o.setOrderTime(order.getOrderTime());
			o.setTotalPrice(order.getTotalPrice());
			return orderRepository.save(o);
			
		}
		return null;
	}

	@Override
	public Order viewOrder(int oid) {
		Optional<Order> optionalOrder = orderRepository.findById(oid);
		if(optionalOrder.isPresent()) {
			return optionalOrder.get();
		}
		return null;
	}

}
