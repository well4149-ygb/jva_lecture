package com.urdomain.ch11.sec03_4;

public class Member implements Cloneable { // cloneable은 객체를 복사할 수있는 인터페이스임.
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	// 생성자
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
			// clone() 메소드의 리턴 타입은 Object이므로 Member 타입으로 캐스팅해야 됨.
		} catch (CloneNotSupportedException e) {

		}
		return cloned;
	}

}
