package com.urdomain.ch15.sec04Map.ex01HashMap;

public class Student {
	public int sno;
	public String name;
	//������
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	//�޼���
	//�й��� �̸��� ��ġ�ϴ� ��� true�� ����
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name)) ;
		} else {
			return false;
		}
	}
	//�й��� ������ ������ ���� ����
	public int hashCode() {
		return sno + name.hashCode();
	}
}
