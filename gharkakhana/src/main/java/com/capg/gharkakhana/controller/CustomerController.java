package com.capg.gharkakhana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.gharkakhana.entity.FoodItems;
import com.capg.gharkakhana.entity.Order;
import com.capg.gharkakhana.entity.Vendor;
import com.capg.gharkakhana.service.CustomerService;

@RestController
@RequestMapping(value = "FoodCustomer")
public class CustomerController {

	@Autowired
	private CustomerService cs;
	
	@PostMapping("/createOrder")
	public ResponseEntity<String> createOrder(Order order){
		cs.createOrder(order);
    	return new ResponseEntity<>("Customer Record Save Successfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/getVendor")
	public List<Vendor> getByVendor(){
		
        return cs.getByVendor();
    }
	
	@GetMapping("/getFood")
	public List<FoodItems> getByFood(){
		
        return cs.getByFood();
    }
	
	@GetMapping("/getPriceAsc")
	public List<FoodItems> getPriceAsc(){
		
        return cs.getPriceAsc();
    }
	@GetMapping("/getPriceDsc")
	public List<FoodItems> getPriceDsc(){
		
        return cs.getPriceDsc();
    }
	@GetMapping("/findbyFood")
	public List<FoodItems> findByFood(String name){
		
        return cs.findByFood(name);
    }
}