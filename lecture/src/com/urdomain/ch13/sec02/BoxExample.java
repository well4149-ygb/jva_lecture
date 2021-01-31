package com.urdomain.ch13.sec02;

public class BoxExample {
	public static void main(String[] args) {
		//오브젝트를 선언하면 모든것으로 형변환이 가능하다.
		Box box = new Box();//Box객체를 선언
		box.set("홍길동");      //String -> Object (자동 타입 변환)->오브젝트이므로
		String name = (String) box.get(); //Object -> String (강제 타입 변환)
		
		box.set(new Apple());			//Apple -> Object(자동 타입 변환)
		Apple apple = (Apple)box.get(); //Object ->String(강제 타입 변환)
	}
}
