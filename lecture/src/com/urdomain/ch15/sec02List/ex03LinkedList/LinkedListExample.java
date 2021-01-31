package com.urdomain.ch15.sec02List.ex03LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//ArrayList�� ���� 
		List<String> list1 = new ArrayList<String>();
		//LinkedList�� ����
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		//arraylist�� �ӵ�����
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�:" + (endTime-startTime) +"ns");
		
		//linkedlist�� �ӵ�����
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: "+(endTime-startTime) +"ns");
	}
}
