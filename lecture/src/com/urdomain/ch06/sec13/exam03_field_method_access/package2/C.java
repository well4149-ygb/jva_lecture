package com.urdomain.ch06.sec13.exam03_field_method_access.package2;

import com.urdomain.ch06.sec13.exam03_field_method_access.package1.A;

public class C {
	//생성자
	public C() {
		A a = new A();
		
		a.field1 = 1;   
		//a.field2 = 1; package1에서만 사용이 가능   
		//a.field3 = 1; package1의 A클래스에서만 사용이 가능   
		
		a.method1();   
		//a.method2(); package1에서만 사용이 가능    
		//a.method3(); package1의 A클래스에서만 사용이 가능
		
	}
}
