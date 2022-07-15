package com.capg.gharkakhana.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderChart")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	//private int vendorId;
	@ElementCollection(targetClass = String.class)
	private List<FoodItems> items;
	private long orderTime;
	private int totalPrice;
	public long getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(long orderTime) {
		this.orderTime = orderTime;
	}
	public List<FoodItems> getItems() {
		return items;
	}
	public void setItems(List<FoodItems> items) {
		this.items = items;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
