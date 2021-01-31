package com.urdomain.ch15.sec03Set;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");
		set.add("iBATIS");
		//Java�� �ߺ���
		
		int size = set.size();
		System.out.println("�� ��ü��:"+size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: "+ set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element =iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������");
		}
	}
}
