package com.urdomain.ch08.sec05;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);// �ڵ� Ÿ�� ��ȯ
		driver.drive(taxi);// �ڵ� Ÿ�� ��ȯ
	}
}
