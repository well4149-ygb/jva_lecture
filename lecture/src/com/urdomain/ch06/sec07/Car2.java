package com.urdomain.ch06.sec07;

public class Car2 {

	String comapny = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){
		
	}//생성자
	
	Car2(String model){
		this.model = model;
	}
	
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
