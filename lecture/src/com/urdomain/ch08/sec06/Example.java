package com.urdomain.ch08.sec06;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();//interfaceA������ methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();// interfaceB ������ methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
