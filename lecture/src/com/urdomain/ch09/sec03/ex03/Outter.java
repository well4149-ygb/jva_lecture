package com.urdomain.ch09.sec03.ex03;

public class Outter {
	// 자바 7이전 버전
	public static void main(int arg) {
		final int localVariable = 1;
		// arg =100;
		// localVarable = 100;->x
		class inner {

			public void mehtod() {
				int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable =1;
		//arg =100;->x
		//localVariable = 100;->x
		class inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
