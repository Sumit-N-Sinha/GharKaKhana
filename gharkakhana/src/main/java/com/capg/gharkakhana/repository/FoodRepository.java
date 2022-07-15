package com.capg.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.gharkakhana.entity.FoodItems;

@Repository
public interface FoodRepository extends JpaRepository<FoodItems, Integer> {

}
