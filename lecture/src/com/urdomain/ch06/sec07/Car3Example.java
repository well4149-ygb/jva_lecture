package com.urdomain.ch06.sec07;

public class Car3Example {
	public static void main(String[] args) {
		Car3 car1 = new Car3();
		System.out.println("car1.company :"+ car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("�ڰ���");
		System.out.println("car2.company :"+ car2.comapny);
		System.out.println("car2.model :"+car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("�ڰ���","����");
		System.out.println("car3.company :"+ car3.comapny);
		System.out.println("car3.model :"+ car3.model);
		System.out.println("car3.color :"+ car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("�ڰ���","����",200);
		System.out.println("car4.company :"+ car4.comapny);
		System.out.println("car4.model :"+car4.model);
		System.out.println("car4.color :"+car4.color);
		System.out.println("car4.maxSpeed :"+car4.maxSpeed);
		
	}
}
