package com.urdomain.ch07.sec07;

public class ChildExample2 {
	public static void main(String[] args) {
		Parent2 parent2 = new Child2();
		parent2.field1 = "data1";
		parent2.method1();
		parent2.method2();
		/*
		parent.field2 = "data2";  //(�Ұ���)
		parent.method3();         //(�Ұ���)
		*/
		
		Child2 child2 = (Child2) parent2;
		child2.field2 = "yyy";  //(����)
		child2.method3();     //(����)
	}
}
