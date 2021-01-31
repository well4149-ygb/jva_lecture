package com.urdomain.ch15.sec05.ex02TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample03 {
	public static void main(String[] args) {
		//Ʈ���� ����
		TreeSet<String> treeSet = new TreeSet<String>();
		//Ʈ������ �������
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c~f ������ �ܾ� �˻�]");
		NavigableSet<String> rangeSet = treeSet.subSet("a", true, "f", true);
													//�˻��ܾ�� c���� f����->c<=�˻��ܾ�<=f 
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
