package com.urdomain.ch15.sec04Map.ex01HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map��ü ���� Ÿ���� String,Integer
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//��ü ���� (String,Integer)
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("��â��", 80);
		map.put("ȫ�浿", 95);
		//'ȫ�浿' Ű�� ���� ������ ���� �������� ������ ������ ��ġ
		System.out.println("�� Entry ��:"+ map.size());
		
		//��ü ã��
		System.out.println("\tȫ�浿 :"+ map.get("ȫ�浿"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		//keySet()�޼ҵ带 ����ؼ� ��� Ű�� Set �÷������� ���� ����,while���� �̿��ؼ� Ű�� �ϳ��� ��� 
		//get()�޼ҵ带 ���� ���� ��´�.
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��:"+map.size());
		
		//��ü ����
		//2��° ���: entrySet() �޼ҵ�� ��� Map.Entry�� Set�÷������� ���� ����, 
		//�ݺ���(while)�� ���ؼ� Map.Entry�� �ϳ��� ��� 
		//getKey()�� getValue()�޼ҵ带 �̿��� Ű�� ���� ��´�.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer>entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key + ":" + value);
		}
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��:" + map.size());
	}
}
