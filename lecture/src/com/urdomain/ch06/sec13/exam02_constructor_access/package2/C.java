package com.urdomain.ch06.sec13.exam02_constructor_access.package2;

import com.urdomain.ch06.sec13.exam02_constructor_access.package1.A;

public class C {
	A a1 = new A(true);
//	A a2 = new A(1);     default 생성자 접근 불가(컴파일 에러)
//	A a3 = new A("문자열");private 생성자 접근 불가(컴파일 에러)
}
