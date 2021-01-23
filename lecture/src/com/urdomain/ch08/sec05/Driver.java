package com.urdomain.ch08.sec05;

public class Driver {
	public void drive(Vehicle vehicle) {//vehicle이 Bus와 Taxi의 객체
		if(vehicle instanceof Bus) {//vehicle 매개변수가 참조하느 객체가 Bus인지 조사
			Bus bus = (Bus)vehicle;//Bus 객체일 경우 안전하게 강제 타입 변환시킴
			bus.checkFare();// Bus타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}
}
