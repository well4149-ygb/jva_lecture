package com.urdomain.ch01;

public class PP {
public static void main(String[] args) {
		String id = "well4149";
		id = id.replaceAll("(?<=.{4})." , "*");
		System.out.println(id);
	}
}
