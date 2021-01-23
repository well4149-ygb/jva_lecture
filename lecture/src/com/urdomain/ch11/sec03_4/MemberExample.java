package com.urdomain.ch11.sec03_4;

public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성
		Member orginal = new Member("blue","홍길동","12345",25,true);
		 //복제 객체에서 패스워드 변경
		Member cloned = orginal.getMember();
		cloned.password ="67890"; 
		
		System.out.println("복제 객체의 필드값");
		System.out.println("id:"+cloned.id);
		System.out.println("name"+cloned.name);
		System.out.println("password"+cloned.password);
		System.out.println("age"+cloned.age);
		System.out.println("adult"+cloned.adult);
		
		System.out.println();
		
		System.out.println("원본 객체의 값");
		System.out.println("id"+orginal.id);
		System.out.println("name"+orginal.name);
		System.out.println("password"+orginal.password);
		System.out.println("age"+orginal.age);
		System.out.println("adult"+orginal.adult);
	}
}
