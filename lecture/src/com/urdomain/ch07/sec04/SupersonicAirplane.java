package com.urdomain.ch07.sec04;

public class SupersonicAirplane extends Airplane{
	public static final int Normal = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = Normal;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}
	
	
}
