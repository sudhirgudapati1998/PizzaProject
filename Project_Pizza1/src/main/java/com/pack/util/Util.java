package com.pack.util;

import java.util.HashMap;

public class Util {
	private static HashMap<Integer, String> toppings=new HashMap<>();
	public static HashMap<Integer, String> getToppings(){
		toppings.put(30, "capsicum");
		toppings.put(50, "mushroom");
		toppings.put(70, "jalapeno");
		toppings.put(85, "paneer");
		return toppings;
	}

}
