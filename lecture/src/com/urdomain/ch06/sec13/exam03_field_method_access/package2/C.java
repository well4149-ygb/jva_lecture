package com.urdomain.ch06.sec13.exam03_field_method_access.package2;

import com.urdomain.ch06.sec13.exam03_field_method_access.package1.A;

public class C {
	//������
	public C() {
		A a = new A();
		
		a.field1 = 1;   
		//a.field2 = 1; package1������ ����� ����   
		//a.field3 = 1; package1�� AŬ���������� ����� ����   
		
		a.method1();   
		//a.method2(); package1������ ����� ����    
		//a.method3(); package1�� AŬ���������� ����� ����
		
	}
}
