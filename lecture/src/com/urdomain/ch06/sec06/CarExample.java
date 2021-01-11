package com.urdomain.ch06.sec06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar =new Car();//객체를 생성
		
		System.out.println("제작회사:" + myCar.comapny);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색깔:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도:" + myCar.speed);
		
		myCar.speed = 60;//Car의 속도를 60으로 초기화함.
		System.out.println("수정된 속도:" + myCar.speed);
	}
}
