package com.urdomain.ch06.sec13.exam02_constructor_access.package1;

public class A {
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {
		
	}//1,0
	
	A(int b){
		
	}//정수
	
	private A(String s) {//private이므로 해당 클래스에서만 사용가능
		
	}//문자열
}
