package com.urdomain.ch15.sec05.ex02TreeSet;

import java.util.TreeSet;

public class TreeSetSample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));// �������� ��� ���� �׾���.
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;

		score = scores.first();
		System.out.println("���� ���� ����:" + score);

		score = scores.last();
		System.out.println("���� ���� ����:" + score);

		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ����:" + score);

		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ����:" + score + "\n");

		score = scores.floor(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����:" + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ����:" + score);

		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println("(���� ��ü�� ��:" + scores.size() + ")");
		}

	}
}
