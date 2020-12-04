package com.justeat.pizzaorder.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="customerid")
	  int customerid;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Column(name="customername")
	String customername;
	@Column(name="address")
	String address;
	@Column(name="phoneno")
	String phoneno;
	
	  @Column(name="topping")
	  String topping;
	 

	
	  public String getTopping() { return topping; } 
	  public void setTopping(String
	  topping) { this.topping = topping; }
	 
}
