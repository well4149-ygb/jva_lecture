package com.urdomain.ch06.sec13.exam03_field_method_access.package1;

public class A {
	public int field1; //public ����
	int field2;        //default����
	private int field3;//private����->�ش� Ŭ���������� ���
	//������
	public A() {
		field1 =1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
	}
	//�޼���
	public void method1() {}
	void method2() {}
	private void method3() {}
}
