package com.pack.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
 

import org.hibernate.validator.constraints.NotEmpty;
 

 

@Entity
@Table(name="LoginTable")

public class User {
	public User()
	{
		
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="id")
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Column(name="username")
	@NotEmpty(message="uname Cannot be empty") 
	String uname;
	
	@Column(name="pwd") 
	
	String pwd;


}
