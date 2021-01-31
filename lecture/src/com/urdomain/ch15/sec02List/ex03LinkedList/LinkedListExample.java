package com.urdomain.ch15.sec02List.ex03LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//ArrayList를 선언 
		List<String> list1 = new ArrayList<String>();
		//LinkedList를 선언
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		//arraylist의 속도측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간:" + (endTime-startTime) +"ns");
		
		//linkedlist의 속도측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime-startTime) +"ns");
	}
}
