package com.urdomain.ch13.sec06;

public class Course<T> {

	private String name;
	private T[] students;

	// 持失切
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	// getter
	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	// 五社球
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
