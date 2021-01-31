package com.urdomain.ch13.sec02;

public class Box2<T> {//타입을 선언 ->정해지지 않음
	private T t;
	//생성자
	public T get() {
		return t;
	}
	
	public void set (T t) {
		this.t = t;
	}
}
