package com.urdomain.ch13.sec03;

public class Product< B , M > {//타입을 복수로 선언이 가능하다.
	private B kind;
	private M model;
	
	public B getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	public void setKind(B kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
