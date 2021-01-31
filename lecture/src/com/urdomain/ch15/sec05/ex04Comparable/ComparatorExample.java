package com.urdomain.ch15.sec05.ex04Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		//Ʈ���� ���� ->DescendingComparatorŬ���� ����
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		//Ʈ���¿� ��������.
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		//���ͷ����� ����
		Iterator<Fruit> iterator = treeSet.iterator();
		//�ݺ����� Ȱ���ؼ� ����� ��ü�� ���
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" +fruit.price);
		}
	}
}
