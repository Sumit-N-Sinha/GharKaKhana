package com.capg.gharkakhana.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private int oid;
	private int vid;
	private String orderDescription;
	private int totalCost;
	@OneToMany()
	private List<Vendor> vendorList;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public List<Vendor> getVendorList() {
		return vendorList;
	}
	public void setVendorList(List<Vendor> vendorList) {
		this.vendorList = vendorList;
	}


}