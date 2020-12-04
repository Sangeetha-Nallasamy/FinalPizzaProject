package com.justeat.pizzaorder.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.justeat.pizzaorder.service.*;
import com.justeat.pizzaorder.bean.*;

@Controller
public class UserController {
	@Autowired
	private LoginService userService;
	
	
	@RequestMapping("/login")
	public String add(Model m)
	{
		
		m.addAttribute("userBean", new User());
		return "login";
	}
	@RequestMapping("/logincheck")
	public String processForm( @ModelAttribute("userBean") User user) {

		System.out.println(user.getUsername());
		int userExists = userService.checkLogin(user.getUsername(),user.getPassword());
		System.out.println(userExists);
		if(userExists==1){
			
			return "home";
		}else{
			
			return "invalid";
		}
		
	}
      @RequestMapping("/placeorder")
      public String place(Model m)
  	{
  		
  		m.addAttribute("userBean1", new Customer());
  		return "placeorder";
  	}
     @RequestMapping("/order")
     public String orderform(@RequestParam("topping") int topping,@ModelAttribute("userBean1") Customer customer,PizzaOrder pizzaOrder,Model m) {
    	 int pid=userService.placeOrder(customer,pizzaOrder,topping);
    	 m.addAttribute("pid",pid);
    	 return "success";
     }
     @RequestMapping("/backtohome")
     public String back() {
    	 return "home";
     }
     @RequestMapping("/exit")
     public String exit() {
    	 return "exit";
     }
     @RequestMapping("/return")
     public String returning() {
    	 return "home";
     }

}
