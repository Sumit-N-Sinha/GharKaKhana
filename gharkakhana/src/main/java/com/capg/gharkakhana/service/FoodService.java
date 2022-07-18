package com.capg.gharkakhana.service;

import javax.validation.Valid;

import com.capg.gharkakhana.entity.FoodItems;

public interface FoodService {

	FoodItems saveOrUpdate(@Valid FoodItems food);

	FoodItems findFoodByFoodIdentifier(String foodIdentifier);

	Iterable<FoodItems> findAllFood();

	void deleteFoodByFoodIdentifier(String foodIdentifier);

}
