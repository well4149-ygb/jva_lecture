package com.urdomain.ch06.sec08;

public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		//���簢���� ����
		double result1 = myCalcu.areaRectangle(10);
		
		//���簢���� ����
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢���� ����:"+ result1);

		System.out.println("���簢���� ����:"+ result2);
	}
}
