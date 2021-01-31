package com.urdomain.ch15.sec02List.ex02Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board1>list = new Vector<Board1>();
		
		list.add(new Board1("제목1","내용1","글쓴이1"));
		list.add(new Board1("제목2","내용2","글쓴이2"));
		list.add(new Board1("제목3","내용3","글쓴이3"));
		list.add(new Board1("제목4","내용4","글쓴이4"));
		list.add(new Board1("제목5","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		
		for (int i = 0; i < list.size(); i++) {
			Board1 board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}
}
