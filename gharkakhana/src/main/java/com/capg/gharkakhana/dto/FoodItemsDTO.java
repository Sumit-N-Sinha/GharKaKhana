package com.capg.gharkakhana.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FoodItemsDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodId;
    @NotBlank(message = "Name cannot be blank")
    @Size(min=3,message= "Name should have atleast 3 characters")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name should contain only alphabets")
    private String name;
    @NotNull(message = "Price cannot be zero")
    @NotBlank(message = "Price cannot be blank")
    private int price;
    @NotBlank(message = "Phone number cannot be blank")
    private int quantity;
    
    public FoodItemsDTO() {
    	
    }

    public int getFoodId() {
    	return foodId;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
