package com.urdomain.ch07.sec02;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��:" + dmbCellPhone.model);
		System.out.println("����:" + dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��:" + dmbCellPhone.channel);
		
		//CellPhone���κ����� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���. ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~~~�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDumb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDumb();
	}
}
