package com.urdomain.ch06.sec08;

public class Car2 {
	//�ʵ�
	int speed;
	
	//������
	
	//�޼���
	int getSpeed() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10;i<=50;i++) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:"+speed+"km/h)");
		}
	}
}
