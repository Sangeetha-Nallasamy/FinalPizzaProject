package com.justeat.pizzaorder.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pizzaorder")
public class PizzaOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="orderid")
	  int orderid;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerid",unique=true)
	private Customer customerid;
	
	public Customer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}

	@Column(name="totalprice")
	int totalprice;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	
	  
	 
	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	
}
