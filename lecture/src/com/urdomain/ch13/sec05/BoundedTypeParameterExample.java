package com.urdomain.ch13.sec05;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		int result1 =Util.compare(10, 20);//int->Integer�� �ڵ� �ڽ�
		System.out.println(result1);
		
		int reuslt2 = Util.compare(4.5, 3);//double->Double�� �ڵ��ڽ�
		System.out.println(reuslt2);
	}
}
