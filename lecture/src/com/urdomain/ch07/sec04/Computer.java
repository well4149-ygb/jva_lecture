package com.urdomain.ch07.sec04;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle ��ü");
		return super.areaCircle(r);
	}
	
}
