package com.urdomain.ch07.sec07;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;//�ڵ� Ÿ�� ��ȭ(������)
		parent.method1();
		parent.method2();//�����ǵ� �޼ҵ尡 ȣ���
		//parent.method3();(ȣ�� �Ұ���)
	}
}
