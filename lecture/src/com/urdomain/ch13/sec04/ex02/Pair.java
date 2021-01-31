package com.urdomain.ch13.sec04.ex02;

public class Pair<K,V> {//타입은 2개로
	private K key;
	private V value;
	//생성자
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	//setter,getter
	public void setKey(K key) {this.key = key;}
	public void setValue(V value) {this.value = value;}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}