package com.capg.gharkakhana.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.gharkakhana.entity.FoodItems;
import com.capg.gharkakhana.entity.Order;
import com.capg.gharkakhana.entity.Vendor;
import com.capg.gharkakhana.exception.FoodItemNotFoundException;
import com.capg.gharkakhana.repository.FoodRepository;
import com.capg.gharkakhana.repository.OrderRepository;
import com.capg.gharkakhana.repository.VendorRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private FoodRepository foodRepository;
	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public Order createOrder(Order order) {
		
		return null;
		
	}

	@Override
	public List<Vendor> getByVendor() {
		// TODO Auto-generated method stub
		List<Vendor> vendorList = new ArrayList<>();
		vendorRepository.findAll().forEach(vendor -> vendorList.add(vendor));
		return vendorList;
	}

	@Override
	public List<FoodItems> getByFood() {
//		List<FoodItems> food = foodRepository.findAll();
//		List<FoodItems> foodDTOList = new ArrayList<>();
//		foodDTOList = food.stream().map(f->{
//			FoodItems foodDTO = new FoodItems();
//			foodDTO.setFoodName(f.getFoodName());
//			
//			return foodDTO;
//		}).collect(Collectors.toList());
		   
		List<FoodItems> foodList = new ArrayList<>();
		foodRepository.findAll().forEach(foodList::add);
		return foodList;
	
	}

	@Override
	public List<FoodItems> getPriceAsc() {
		List<FoodItems> food = foodRepository.findAll();
		List<FoodItems> foodDTOList = new ArrayList<>();
		foodDTOList = food.stream().map(f->{
			FoodItems foodDTO = new FoodItems();
			foodDTO.setFoodName(f.getFoodName());
			foodDTO.setPrice(f.getPrice());
			foodDTO.setQuantity(f.getQuantity());
			foodDTO.setInfo(f.getInfo());
			return foodDTO;
		}).collect(Collectors.toList());
		
		List<FoodItems> fd = foodDTOList.stream().sorted(Comparator.comparing(FoodItems::getPrice)).collect(Collectors.toList());
		return fd;
	}

	@Override
	public List<FoodItems> getPriceDsc() {
		List<FoodItems> food = foodRepository.findAll();
		List<FoodItems> foodDTOList = new ArrayList<>();
		foodDTOList = food.stream().map(f->{
			FoodItems foodDTO = new FoodItems();
			foodDTO.setFoodName(f.getFoodName());
			foodDTO.setPrice(f.getPrice());
			foodDTO.setQuantity(f.getQuantity());
			foodDTO.setInfo(f.getInfo());
			return foodDTO;
		}).collect(Collectors.toList());
		
		List<FoodItems> fd = foodDTOList.stream().sorted(Comparator.comparing(FoodItems::getPrice).reversed()).collect(Collectors.toList());
		return fd;
	}

	@Override
	public List<FoodItems> findByFood(String name) {
		// TODO Auto-generated method stub
		List<FoodItems> foodItem= foodRepository.findByFoodName(name);
		if(!foodItem.isEmpty())
			foodRepository.findByFoodName(name);
		else
			throw new FoodItemNotFoundException("Search Operation failed \n No food Found with id: "+name);
		return foodItem;
	
	}

	
}
