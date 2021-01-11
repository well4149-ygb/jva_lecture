package com.urdomain.ch06.sec10;

public class Television {
	static String company = "Samsung";
	static String logo    = "LCD";
	static String info;
	
	static {
		info = company + "-" + logo;
	}
}
