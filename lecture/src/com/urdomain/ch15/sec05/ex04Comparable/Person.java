package com.urdomain.ch15.sec05.ex04Comparable;

public class Person implements Comparable<Person>{
	//멤버변수
	public String name;
	public int age;
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	//비교
	@Override
	public int compareTo(Person o) {
		if(age<o.age)return -1;
		else if(age == o.age) return 0;
		return 1;
	}
}
