package com.urdomain.ch13.sec04.ex02;

public class Util {
	public static<K,V> boolean compare(Pair<K,V>p1,Pair<K,V>p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());//p1�� key�� p2�� key���� ��
		boolean ValueCompare = p1.getValue().equals(p2.getValue());//p1�� value�� p2�� value�� ��
		return KeyCompare && ValueCompare;//2���� ���� ��ȯ
 	}
}
