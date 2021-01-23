package com.urdomain.ch09.sec03.ex02;

public class A {
	int field1;

	void method1() {
	}

	static int field2;

	static void method2() {
	}

	class B {
		void method() {
			// 모든 필드와 메서드에 접근 할 수 있다.
			field1 = 10;
			method();

			field2 = 10;
			method2();
		}
	}

	static class C {
		void method() {
			// field1 =10;
			// method1();
			
			field2 =10;
			method2();
		}
	}
}
