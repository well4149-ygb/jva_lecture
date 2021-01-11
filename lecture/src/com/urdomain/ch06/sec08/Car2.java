package com.urdomain.ch06.sec08;

public class Car2 {
	//필드
	int speed;
	
	//생성자
	
	//메서드
	int getSpeed() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10;i<=50;i++) {
			speed = i;
			System.out.println("달립니다.(시속:"+speed+"km/h)");
		}
	}
}
