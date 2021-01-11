package com.urdomain.ch06.sec13.exam03_field_method_access.package1;

public class A {
	public int field1; //public 접근
	int field2;        //default접근
	private int field3;//private접근->해당 클래스에서만 사용
	//생성자
	public A() {
		field1 =1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
	}
	//메서드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
