package com.urdomain.ch15.sec04Map.ex01HashMap;

public class Student {
	public int sno;
	public String name;
	//생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	//메서드
	//학번과 이름이 일치하는 경우 true를 리턴
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name)) ;
		} else {
			return false;
		}
	}
	//학번이 같으면 동일한 값을 리턴
	public int hashCode() {
		return sno + name.hashCode();
	}
}
