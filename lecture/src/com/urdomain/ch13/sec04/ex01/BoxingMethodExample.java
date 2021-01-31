package com.urdomain.ch13.sec04.ex01;

import com.urdomain.ch13.sec02.Box2;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box2<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box2<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
