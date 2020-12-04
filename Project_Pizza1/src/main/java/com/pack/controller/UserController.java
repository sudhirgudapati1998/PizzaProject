package com.pack.controller;
import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.model.Customer;
import com.pack.model.PizzaOrder;
import com.pack.model.User;
import com.pack.service.UserService;
import com.pack.util.Util;

@Controller

public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private PizzaOrder pizzaOrder;
 
	
	@RequestMapping("user")
	public String user(Model m)
	{
		
		m.addAttribute("userBean", new User());
		return "User";
	}
	
	
	@RequestMapping("validate")
	public String validate(@ModelAttribute("userBean")User user,Model m)
	{
		 String res=userService.validate(user);
		 if(res.equals("success"))
			 return "homepage";
					 
			 else
				 return "fail";
	}
	HashMap hm=new HashMap();
	@RequestMapping("/UtilController")
	public String getToppings(Model m){
		
		hm=Util.getToppings();
		m.addAttribute("pizzatoppings", hm);
		m.addAttribute("customer", new Customer());
		return "placeorder";
		
	}
	@RequestMapping(value="/saveordercontroller")
	public String saveOrder(@RequestParam("topping")int topping,Model m,@ModelAttribute("customer")Customer customer){
		int pid=userService.placeOrder(customer,pizzaOrder,topping);
		m.addAttribute("pid", pid);
		return "success";
		
		
	}
	
	
	
}
