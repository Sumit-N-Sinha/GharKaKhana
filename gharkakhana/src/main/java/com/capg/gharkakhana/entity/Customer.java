package com.capg.gharkakhana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FoodCustomer")
public class Customer {

	//Makes it as a primary key
	@Id
	//Value comes auto-generated
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String cname,email,address;
	private long phone;
	
	//Getters and Setters
	
	
	public int getCustomerId() {
		return customerId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
