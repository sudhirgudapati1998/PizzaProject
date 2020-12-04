package com.pack.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.pack.model.Customer;
import com.pack.model.PizzaOrder;
import com.pack.model.User;

public class UserDao {
	@Autowired
	private	 SessionFactory sessionFactory;
	 
	 public String validate(User user){
		 Session session=sessionFactory.openSession();
		 String hql="from User where uname=:unam and pwd=:passwrd";
		 Query query=session.createQuery(hql);
		 query.setParameter("unam", user.getUname());
		 query.setParameter("passwrd", user.getPwd());
		 
		 List list=query.getResultList();
		 if(list.size()==0)
			 return "failure";
		 else
			 return "success";
		
	 }
	  
	 public int placeOrder(Customer customer,PizzaOrder pizza){
		 Session session=this.sessionFactory.openSession();
		 Transaction tx=session.beginTransaction();
		 pizza.setCustid(customer);
		 session.save(pizza);
		 int pid=pizza.getOrderid();
		 tx.commit();
		 session.close();
		 return pid;
	 }
	 
	
}
