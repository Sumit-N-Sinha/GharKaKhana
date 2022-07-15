package com.capg.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.gharkakhana.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}

