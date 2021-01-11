package com.urdomain.ch07.sec05;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
   
	//final을 선언한 stop은 오버라이딩을 할 수 없음
	
}
