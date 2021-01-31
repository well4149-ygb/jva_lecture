package com.urdomain.ch15.sec05.ex04Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		//트리셋 선언 ->DescendingComparator클래스 선언
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		//트리셋에 집에넣음.
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		//이터레이터 선언
		Iterator<Fruit> iterator = treeSet.iterator();
		//반복문을 활용해서 저장된 객체를 출력
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" +fruit.price);
		}
	}
}
