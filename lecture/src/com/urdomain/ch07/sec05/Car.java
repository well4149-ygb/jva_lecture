package com.urdomain.ch07.sec05;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
