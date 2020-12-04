package com.pack.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.pack.dao.UserDao;
import com.pack.model.Customer;
import com.pack.model.PizzaOrder;
import com.pack.model.User;

public class UserService {
	@Autowired
	private UserDao userDAO;
	@Autowired
	private PizzaOrder pizzaOrder;
 


		public String validate(User user){
			String res=userDAO.validate(user);
			return res;
		}
		
		public int placeOrder(Customer customer,PizzaOrder pizza,int topping){
			int totalprice=0;
			totalprice=350+topping;
			pizza.setTotalprice(totalprice);
			int k=userDAO.placeOrder(customer,pizza);
			return k;
		}
		
}
