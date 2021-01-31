package com.urdomain.ch15.sec05.ex02TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample02 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();

		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		scores.add(new Integer(60));

		NavigableSet<Integer> descendingSet = scores.descendingSet();
		//트리셋에 저장된 숫자를 내림차순으로 정렬
		System.out.print("내림차순으로 정렬:");
		for (Integer socre : descendingSet) {
			System.out.print(socre + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		//내림차순으로 정렬된 숫자를 내림차순으로 정렬(오름차순이 된다.)
		System.out.print("오름차순으로 정렬:");
		for (Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}
}
