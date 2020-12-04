package com.justeat.pizzaorder.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.justeat.pizzaorder.bean.*;



public class LoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int checkLogin(String userName, String Password){
		
		System.out.println("In Check login");
		Session session1=sessionFactory.openSession();
		 Transaction tx=null;
		tx=session1.beginTransaction(); 
		String hql="select password from User where username=:unam";
		Query query=session1.createQuery(hql);
		query.setParameter("unam",userName);
		List<String> list=query.getResultList();
		
		for(String o:list) {
			
		if(o.equals(Password)) 
			return 1;
		}
		tx.commit();
		session1.close();
			return 0;
		
		
}
    public int placeOrder(Customer customer,PizzaOrder pizza) {
    	Session session1=sessionFactory.openSession();
		 Transaction tx=null;
		tx=session1.beginTransaction(); 
		pizza.setCustomerid(customer);
		session1.save(pizza);
		int pid=pizza.getOrderid();
		tx.commit();
		session1.close();
		return pid;
    }


}
