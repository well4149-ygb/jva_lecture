package com.urdomain.ch13.sec02;

public class BoxExample {
	public static void main(String[] args) {
		//������Ʈ�� �����ϸ� �������� ����ȯ�� �����ϴ�.
		Box box = new Box();//Box��ü�� ����
		box.set("ȫ�浿");      //String -> Object (�ڵ� Ÿ�� ��ȯ)->������Ʈ�̹Ƿ�
		String name = (String) box.get(); //Object -> String (���� Ÿ�� ��ȯ)
		
		box.set(new Apple());			//Apple -> Object(�ڵ� Ÿ�� ��ȯ)
		Apple apple = (Apple)box.get(); //Object ->String(���� Ÿ�� ��ȯ)
	}
}
