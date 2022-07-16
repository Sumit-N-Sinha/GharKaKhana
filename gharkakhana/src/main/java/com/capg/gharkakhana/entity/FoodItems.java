package com.capg.gharkakhana.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food_items")
public class FoodItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	//private String foodIdentifier;
	private String foodName;
	private String info;
	private double price;
	private int quantity;
	//private String foodStatus;
//	private Date order_date;
//	private Date created_At;
//	private Date updated_At;
	
	
	public FoodItems() {
		
	}
	
	 public FoodItems(int foodId, String foodName, double price, int quantity, String info) {
	        this.foodId = foodId;
	        this.foodName = foodName;
	        this.price = price;
	        this.quantity = quantity;
	        this.info = info;
	    }
	
	public int getFoodId() {
		return foodId;
	}
	
//	public String getFoodIdentifier() {
//		return foodIdentifier;
//	}
//
//	public void setFoodIdentifier(String foodIdentifier) {
//		this.foodIdentifier = foodIdentifier;
//	}

	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
//	public String getFoodStatus() {
//		return foodStatus;
//	}
//	public void setFoodStatus(String foodStatus) {
//		this.foodStatus = foodStatus;
//	}
//	public Date getOrder_date() {
//		return order_date;
//	}
//	public void setOrder_date(Date order_date) {
//		this.order_date = order_date;
//	}
//	public Date getCreated_At() {
//		return created_At;
//	}
//	public void setCreated_At(Date created_At) {
//		this.created_At = created_At;
//	}
//	public Date getUpdated_At() {
//		return updated_At;
//	}
//	public void setUpdated_At(Date updated_At) {
//		this.updated_At = updated_At;
//	}
//	@PrePersist
//	public void onCreate() {
//		this.created_At = new Date();
//		}
//	
//	@PreUpdate
//	public void onUpdate() {
//		this.updated_At = new Date();
//	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(foodId, foodName, info, price, quantity);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		return foodId == other.foodId && Objects.equals(foodName, other.foodName)
				&& Objects.equals(info, other.info)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}


	@Override
	public String toString() {
		return "FoodItems [foodId=\" + foodId + \", foodName=\" + foodName + \", price=\" + price + \", quantity=\" + quantity\r\n"
				+ "				+ \", info=\" + info + \"]";
	}

}
