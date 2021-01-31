package com.urdomain.ch13.sec02;

public class Box2Example {
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<String>();//box2는 문자형만 받을수 있다.
		box1.set("hello");
		
		String str = box1.get();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
	}
}
