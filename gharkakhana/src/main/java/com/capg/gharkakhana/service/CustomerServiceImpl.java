package com.capg.gharkakhana.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.gharkakhana.entity.FoodItems;
import com.capg.gharkakhana.entity.Order;
import com.capg.gharkakhana.entity.Vendor;
import com.capg.gharkakhana.repository.FoodRepository;
import com.capg.gharkakhana.repository.OrderRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private FoodRepository foodRepository;

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		order.setOrderTime(System.currentTimeMillis());
		order.setTotalPrice(order.getItems().stream().mapToInt(e->e.getPrice()*e.getQuantity()).sum());
		return orderRepository.save(order);
		
	}

	@Override
	public List<Vendor> getByVendor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodItems> getByFood() {
		List<FoodItems> food = foodRepository.findAll();
		List<FoodItems> foodDTOList = new ArrayList<>();
		foodDTOList = food.stream().map(f->{
			FoodItems foodDTO = new FoodItems();
			
			foodDTO.setName(f.getName());
			foodDTO.setPrice(f.getPrice());
			foodDTO.setQuantity(f.getQuantity());
			return foodDTO;
		}).collect(Collectors.toList());
		   
		return foodDTOList;
	
	}

	
}
