package com.capg.gharkakhana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.gharkakhana.entity.Order;
import com.capg.gharkakhana.service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/createOrder")
	public ResponseEntity<String> createOrder(Order order){
		orderService.createOrder(order);
    	return new ResponseEntity<>("Order created Successfully",HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAOrder(@PathVariable int id) {
		orderService.deleteOrder(id);
		return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
	}
	@PutMapping("/update/")
	public ResponseEntity<Order> updateAOrder(@PathVariable int id, Order order) {
		Order o1 = orderService.updateOrder(id, order);
		return new ResponseEntity<>(o1, HttpStatus.OK);
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<Order> viewAOrder(@PathVariable int id) {
		Order o1 = orderService.viewOrder(id);
		return new ResponseEntity<>(o1, HttpStatus.OK);
	}
	
	

}
