package com.capg.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.gharkakhana.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
