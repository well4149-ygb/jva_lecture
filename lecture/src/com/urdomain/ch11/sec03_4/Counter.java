package com.urdomain.ch11.sec03_4;

public class Counter {
	
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"ºó °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ");
	}
}
