package com.urdomain.ch08.sec05;

public class VehecleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();(x)
		
		Bus bus = (Bus)vehicle; //���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();//Bus Ŭ�������� checkFare()�� ����
	}
}
