package com.urdomain.ch06.sec06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar =new Car();//��ü�� ����
		
		System.out.println("����ȸ��:" + myCar.comapny);
		System.out.println("�𵨸�:" + myCar.model);
		System.out.println("����:" + myCar.color);
		System.out.println("�ְ�ӵ�:" + myCar.maxSpeed);
		System.out.println("����ӵ�:" + myCar.speed);
		
		myCar.speed = 60;//Car�� �ӵ��� 60���� �ʱ�ȭ��.
		System.out.println("������ �ӵ�:" + myCar.speed);
	}
}
