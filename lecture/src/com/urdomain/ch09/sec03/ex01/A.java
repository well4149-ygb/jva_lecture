package com.urdomain.ch09.sec03.ex01;

public class A {

	// �ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();

	// �ν��Ͻ� �޼ҵ�
	void method() {
		B var1 = new B();
		C var2 = new C();
	}

	// ���� �ʵ� �ʱ�ȭ
	// static B field3 =new B();->x
	static C field4 = new C();

	// ���� �޼ҵ�
	static void method2() {
		// B var 1 = new B();
		C var2 = new C();
	}

	// �ν��Ͻ� ��� Ŭ����
	class B {
	}

	// ���� ��� Ŭ����
	static class C {
	}
}
