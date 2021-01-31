package com.urdomain.ch13.sec05;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		int result1 =Util.compare(10, 20);//int->Integer로 자동 박싱
		System.out.println(result1);
		
		int reuslt2 = Util.compare(4.5, 3);//double->Double로 자동박싱
		System.out.println(reuslt2);
	}
}
