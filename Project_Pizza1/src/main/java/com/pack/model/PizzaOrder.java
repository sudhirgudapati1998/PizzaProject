package com.pack.model;
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
	private int orderid;
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
	public Customer getCustid() {
		return custid;
	}
	public void setCustid(Customer custid) {
		this.custid = custid;
	}
	@Column(name="totalprice")
	private int totalprice;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="custid",unique=true)
	private Customer custid;

}
