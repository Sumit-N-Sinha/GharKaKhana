package com.capg.gharkakhana.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class FoodItemsDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long foodId;
//	@NotBlank(message = "foodIdentifier Required")
//	@Size(min=3, max=10, message = "invalid foodIdentifier")
//	@Column(updatable = false, unique = true)
//	private String foodIdentifier;
	@NotNull(message= "Foodname can't be null")
	@NotBlank(message = "foodName is required")
	private String foodName;
	
	@NotBlank(message = "foodDescription is required")
	private String info;
	@NotBlank(message = "Price can't be zero")
	private int price;
	@NotBlank(message = "Enter the quantity")
	private int quantity;
//	@NotBlank(message = "foodStatus is required")
//	private String foodStatus;
	
//	private Date order_date;
//	
//	private Date created_At;
//	private Date updated_At;
	
	
	public FoodItemsDTO() {
		
	}
	
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
	
}
