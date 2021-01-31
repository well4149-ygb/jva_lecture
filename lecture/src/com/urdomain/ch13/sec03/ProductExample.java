package com.urdomain.ch13.sec03;

import com.urdomain.ch06.sec08.Car;

public class ProductExample {
	public static  void main(String[] args) {
		//제네릭 타입은 변수 뿐만 아니라 클래스도 가능하다.
		Product<Tv,String> product1 =  new Product<Tv,String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car,String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
