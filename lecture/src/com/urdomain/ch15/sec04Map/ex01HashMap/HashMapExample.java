package com.urdomain.ch15.sec04Map.ex01HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map객체 생성 타입은 String,Integer
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//객체 저장 (String,Integer)
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동창군", 80);
		map.put("홍길동", 95);
		//'홍길동' 키가 같기 때문에 제일 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수:"+ map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 :"+ map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		//keySet()메소드를 사용해서 모든 키를 Set 컬렉션으로 얻은 다음,while문을 이용해서 키를 하나씩 얻고 
		//get()메소드를 통해 값을 얻는다.
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수:"+map.size());
		
		//객체 삭제
		//2번째 방법: entrySet() 메소드로 모든 Map.Entry를 Set컬렉션으로 얻은 다음, 
		//반복자(while)를 통해서 Map.Entry를 하나씩 얻고 
		//getKey()와 getValue()메소드를 이용해 키와 값을 얻는다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer>entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key + ":" + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수:" + map.size());
	}
}
