package com.urdomain.ch06.sec07;

public class Car2 {

	String comapny = "���� �ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){
		
	}//������
	
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
