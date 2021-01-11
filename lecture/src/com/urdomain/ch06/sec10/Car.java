package com.urdomain.ch06.sec10;

public class Car {
	int speed; 
	
	void run() {
		System.out.println(speed + "으로 달려갑니다.");
	}
	
	public static void main(String[] args) {
		Car myCar   = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
