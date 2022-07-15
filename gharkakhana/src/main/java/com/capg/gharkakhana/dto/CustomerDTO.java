package com.capg.gharkakhana.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDTO {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    @NotBlank(message = "First name cannot be blank")
    @Size(min=3,message= "First name should have atleast 3 characters")
    @Pattern(regexp = "^[A-Za-z]+$", message = "First name should contain only alphabets")
    private String cname;
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Enter a valid email address")
    private String email;
    @NotNull(message = "Phone number cannot be blank")
    @NotBlank(message = "Phone number cannot be blank")
    @Size(min=10,max=10,message = "Phone number should have 10 digits")
    @Pattern(regexp = "^[0-9]+$", message = "Phone number should contain only digits")
    private long phone;
    @NotBlank(message = "Address cannot be blank")
    @Size(min=5,message= "Address should have atleast 3 characters")
    private String address;
    public CustomerDTO() {
    	
    }
    public int getCustomerId() {
    	return customerId;
    }
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}

