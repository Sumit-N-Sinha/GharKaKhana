package com.capg.gharkakhana.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.gharkakhana.entity.FoodItems;

@Repository
public interface FoodItemsRepository extends CrudRepository<FoodItems, Integer>{

	FoodItems findByFoodIdentifier(String foodIdentifier);

	Iterable<FoodItems>findAll();
}
