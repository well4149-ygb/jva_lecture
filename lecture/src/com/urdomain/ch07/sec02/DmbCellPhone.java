package com.urdomain.ch07.sec02;

public class DmbCellPhone extends CellPhone{
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼���
	void turnOnDumb() {
		System.out.println("ü��:"+channel+"�� DMB��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��:" + channel + "��ȣ�� �ٲߴϴ�.");
	}
	
	void turnOffDumb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
}
