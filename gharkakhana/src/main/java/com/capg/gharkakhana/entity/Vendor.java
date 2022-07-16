package com.capg.gharkakhana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	private String vendorName;
	private String status;
	@OneToMany(cascade = CascadeType.ALL)
	private List<FoodItems> items;

	public List<FoodItems> getItems() {
		return items;
	}
	public void setItems(List<FoodItems> items) {
		this.items = items;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
