package com.capg.gharkakhana.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.capg.gharkakhana.entity.FoodItems;

public class VendorDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long vendorId;
	@NotNull(message= "Vendor name can't be null")
	@NotBlank(message = "Vendor Name is required")
	private String vendorName;
	@NotBlank(message = "Status is required")
	private String status;
	@Valid
	@NotNull(message = "Food list can't be null")
	private FoodItems fooditem;
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
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
	public FoodItems getFooditem() {
		return fooditem;
	}
	public void setFooditem(FoodItems fooditem) {
		this.fooditem = fooditem;
	}
	
}
