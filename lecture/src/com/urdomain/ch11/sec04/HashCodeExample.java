package com.urdomain.ch11.sec04;

import java.util.Objects;

import com.urdomain.ch06.sec04.Student;

public class HashCodeExample {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"ȫ�浿");
		Student s2 = new Student(1,"ȫ�浿");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hash(s2));
	}
	
	static class Student{
		int sno;
		String name;
		
		Student(int sno, String name){
			this.name= name;
			this.sno = sno;
		}
		
		@Override
		public int hashCode() {
		
			return Objects.hash(sno,name);
		}
		
	}
}
