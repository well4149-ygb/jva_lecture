package com.urdomain.ch06.sec07;

public class Car3 {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Car3(){}//持失切
	
	Car3(String model){
		this(model, "精事" , 250);
	}
	
	Car3(String model, String color){
		this(model, color , 250);
	}
	
	Car3(String model ,String color ,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
