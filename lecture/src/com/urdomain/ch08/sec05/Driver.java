package com.urdomain.ch08.sec05;

public class Driver {
	public void drive(Vehicle vehicle) {//vehicle�� Bus�� Taxi�� ��ü
		if(vehicle instanceof Bus) {//vehicle �Ű������� �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus)vehicle;//Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ��Ŵ
			bus.checkFare();// BusŸ������ ���� Ÿ�� ��ȯ�� �ϴ� ����
		}
		vehicle.run();
	}
}
