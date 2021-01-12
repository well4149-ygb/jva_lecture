package com.urdomain.ch07.sec07;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;//자동 타입 변화(다형성)
		parent.method1();
		parent.method2();//재정의된 메소드가 호출됨
		//parent.method3();(호출 불가능)
	}
}
