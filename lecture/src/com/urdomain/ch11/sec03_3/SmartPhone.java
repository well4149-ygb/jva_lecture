package com.urdomain.ch11.sec03_3;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		//  toString()�� ������
		return company+", "+os;
	}
	
}
