package com.capg.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.gharkakhana.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
