package com.capg.gharkakhana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.gharkakhana.entity.FoodItems;
import com.capg.gharkakhana.exception.FoodIdentifierException;
import com.capg.gharkakhana.repository.FoodItemsRepository;
import com.capg.gharkakhana.repository.FoodRepository;
import com.capg.gharkakhana.service.FoodService;
@Service
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	private FoodItemsRepository foodRepository;
	
	@Override
	public FoodItems saveOrUpdate(FoodItems food) {
		
		try {
		// business logic
			food.setFoodIdentifier(food.getFoodIdentifier().toUpperCase());
		return foodRepository.save(food);
	}catch(Exception ex) {
		throw new FoodIdentifierException("Food Identifier : "+food.getFoodIdentifier()+" already exists");
	}
	}

	@Override
	public FoodItems findFoodByFoodIdentifier(String foodIdentifier) {
		FoodItems food = foodRepository.findByFoodIdentifier(foodIdentifier.toUpperCase());
		if(food==null) {
			throw new FoodIdentifierException("Food Identifier : "+foodIdentifier.toUpperCase()+"does not exist");
	}
		return food;
	}
	
	@Override
	public Iterable<FoodItems> findAllFood() {
		
		return foodRepository.findAll();
	}

	@Override
	public void deleteFoodByFoodIdentifier(String foodIdentifier) {
		// TODO Auto-generated method stub
			FoodItems food = foodRepository.findByFoodIdentifier(foodIdentifier.toUpperCase());
			if(food==null) {
				throw new FoodIdentifierException("Food Identifier : "+foodIdentifier.toUpperCase()+"does not exist");
		}
			foodRepository.delete(food);
		
	}

	
	
	}
