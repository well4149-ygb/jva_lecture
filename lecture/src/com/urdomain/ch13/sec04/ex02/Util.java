package com.urdomain.ch13.sec04.ex02;

public class Util {
	public static<K,V> boolean compare(Pair<K,V>p1,Pair<K,V>p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());//p1의 key와 p2의 key값을 비교
		boolean ValueCompare = p1.getValue().equals(p2.getValue());//p1의 value와 p2의 value를 비교
		return KeyCompare && ValueCompare;//2개를 같이 반환
 	}
}
