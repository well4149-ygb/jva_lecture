package com.urdomain.ch06.sec09;

public class Car {
	//�ʵ�
	String model;
	int    speed;
	
	//������
	Car(String model){
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i =0; i<=50; i++) {
			this.setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�.(�ü�:"+this.speed+"km/h)");
		}
	}
}
