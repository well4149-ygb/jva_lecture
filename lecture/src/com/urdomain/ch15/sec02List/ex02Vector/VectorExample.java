package com.urdomain.ch15.sec02List.ex02Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board1>list = new Vector<Board1>();
		
		list.add(new Board1("����1","����1","�۾���1"));
		list.add(new Board1("����2","����2","�۾���2"));
		list.add(new Board1("����3","����3","�۾���3"));
		list.add(new Board1("����4","����4","�۾���4"));
		list.add(new Board1("����5","����5","�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		
		for (int i = 0; i < list.size(); i++) {
			Board1 board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}
}
