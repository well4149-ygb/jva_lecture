package com.urdomain.ch11.sec07;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = new String("�Ź�ö");
		String strVal2 = "�Ź�ö";
		
		if(strVal1 == strVal2) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("���� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
	}
}
