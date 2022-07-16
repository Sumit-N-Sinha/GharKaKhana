package com.capg.gharkakhana.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.gharkakhana.entity.FoodItems;
import com.capg.gharkakhana.entity.Order;
import com.capg.gharkakhana.entity.Vendor;

@Service
public interface CustomerService {

	
	Order createOrder(Order order);
	List<Vendor> getByVendor();
	List<FoodItems> getByFood();
	List<FoodItems> getPriceAsc();
	List<FoodItems> getPriceDsc();
	List<FoodItems> findByFood(String name);
	
	

}
