package com.capg.gharkakhana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.gharkakhana.entity.FoodItems;

@Repository
public interface FoodRepository extends JpaRepository<FoodItems, Integer> {

	@Query(value="select * from food_items f where f.food_name=food_name",nativeQuery = true)
	List<FoodItems> findByFoodName(@Param("name") String name);

}
