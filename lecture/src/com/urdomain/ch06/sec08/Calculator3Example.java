package com.urdomain.ch06.sec08;

public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		//정사각형의 넓이
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이:"+ result1);

		System.out.println("직사각형의 넓이:"+ result2);
	}
}
