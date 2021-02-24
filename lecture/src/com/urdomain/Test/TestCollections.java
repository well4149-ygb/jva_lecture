package com.urdomain.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCollections {
//	Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라.

//	6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> A C A B F D

//	2.3333333333333335
	public static void main(String[] args) {
		//1.스캐너를 생성+arraylist를 생성
		//2.반복문을 통해서 배열을 넣는다.
		//3.
		 TreeSet a = new TreeSet();

	        for (int i = 0; a.size() < 6; i++) {
	            a.add((int) (Math.random() * 45) + 1);
	        }
	        Iterator it = a.iterator();
	        System.out.println(a);
	}
}
