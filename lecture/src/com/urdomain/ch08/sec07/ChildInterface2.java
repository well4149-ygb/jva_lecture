package com.urdomain.ch08.sec07;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	default void method2() {
		// TODO Auto-generated method stub
		ParentInterface.super.method2();
	}
	
	public void method3();
	
	ChildInterface2 ci2 = new ChildInterface2() {
		
		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
	};
}
