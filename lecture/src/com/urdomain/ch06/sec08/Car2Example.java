package com.urdomain.ch06.sec08;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.KeyTurnOn();
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도:"+speed+"km/h");
	}
}
