package com.justeat.pizzaorder.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.justeat.pizzaorder.dao.*;
import com.justeat.pizzaorder.bean.*;
public class LoginService {
	@Autowired
	 private LoginDao userDao;
	
	@Autowired
	private Customer customer;
	@Autowired
	private PizzaOrder pizzaOrder;
	
	public int checkLogin(String userName, String userPassword){
        System.out.println("In Service class");
        return userDao.checkLogin(userName, userPassword);
 }
	public int placeOrder(Customer customer,PizzaOrder pizzaOrder,int topping) {
		int totalprice=0;
		totalprice=350+topping;
		pizzaOrder.setTotalprice(totalprice);
		int a=userDao.placeOrder(customer,pizzaOrder);
		return a;
	}
}
