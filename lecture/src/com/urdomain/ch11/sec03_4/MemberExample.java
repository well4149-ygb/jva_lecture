package com.urdomain.ch11.sec03_4;

public class MemberExample {
	public static void main(String[] args) {
		//���� ��ü ����
		Member orginal = new Member("blue","ȫ�浿","12345",25,true);
		 //���� ��ü���� �н����� ����
		Member cloned = orginal.getMember();
		cloned.password ="67890"; 
		
		System.out.println("���� ��ü�� �ʵ尪");
		System.out.println("id:"+cloned.id);
		System.out.println("name"+cloned.name);
		System.out.println("password"+cloned.password);
		System.out.println("age"+cloned.age);
		System.out.println("adult"+cloned.adult);
		
		System.out.println();
		
		System.out.println("���� ��ü�� ��");
		System.out.println("id"+orginal.id);
		System.out.println("name"+orginal.name);
		System.out.println("password"+orginal.password);
		System.out.println("age"+orginal.age);
		System.out.println("adult"+orginal.adult);
	}
}
