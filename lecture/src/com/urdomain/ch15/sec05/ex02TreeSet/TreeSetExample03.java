package com.urdomain.ch15.sec05.ex02TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample03 {
	public static void main(String[] args) {
		//트리셋 선언
		TreeSet<String> treeSet = new TreeSet<String>();
		//트리셋을 집어넣음
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("a", true, "f", true);
													//검색단어는 c에서 f까지->c<=검색단어<=f 
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
