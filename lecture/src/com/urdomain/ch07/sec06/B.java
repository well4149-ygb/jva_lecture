package com.urdomain.ch07.sec06;

public class B {
	public void method() {
		A a = new A();      //(o)
		a.field = "value";  //(o)
		a.method();         //(o)
	}
}
