package com.urdomain.ch06.sec13.exam02_constructor_access.package1;

public class A {
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//������
	public A(boolean b) {
		
	}//1,0
	
	A(int b){
		
	}//����
	
	private A(String s) {//private�̹Ƿ� �ش� Ŭ���������� ��밡��
		
	}//���ڿ�
}
