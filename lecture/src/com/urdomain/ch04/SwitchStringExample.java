package com.urdomain.ch04;

public class SwitchStringExample {
	public static void main(String[] args) {
		
		String position = "����";
		
		switch(position) {
		case "A":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
		}
	}
}
