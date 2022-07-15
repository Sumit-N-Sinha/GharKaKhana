package com.capg.gharkakhana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vendorId;
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_id",referencedColumnName = "orderId",unique = true)
//	private int orderId;
	
}
