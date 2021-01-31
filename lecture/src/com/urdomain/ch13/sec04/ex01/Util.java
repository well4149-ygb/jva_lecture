package com.urdomain.ch13.sec04.ex01;

import com.urdomain.ch13.sec02.Box2;

public class Util {
	
	public static<T>Box2<T>boxing(T t) {
		Box2<T> box = new Box2<T>();
		box.set(t);
		return box;
	}
}
