package com.urdomain.ch06.sec15.exam01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declareMethod = Service.class.getDeclaredMethods();
		//Method 객체를 하나씩 처리
			for(Method method : declareMethod) {
				if(method.isAnnotationPresent(PrintAnnotation.class)) {
					PrintAnnotation printannotation = method.getAnnotation(PrintAnnotation.class);
					
					System.out.println("["+ method.getName() + "]");
					
					for(int i=0;i<printannotation.number();i++) {
						System.out.print(printannotation.value());
					}
					System.out.println();
					
					try {
						method.invoke(new Service());
					} catch(Exception e) {
						System.out.println();
					}
				}
			}

	}
}