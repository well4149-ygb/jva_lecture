package com.urdomain.Test;


import java.util.*;

public class Lotto {
//	1.로또번호 생성기(랜덤을 이용할것)
//	->배열을 생성한다.6개v
//	->랜덤을 사용한다. (범위는 1~46까지로 설정한다.)v
//	->반복문을 사용해서 해당 배열에 집어넣고 출력한다.v
//	->반복문 안에 조건문을 집어넣어서 중복을 제거한다.v
	//반복문으로 해당 배열을 출력한다.v

	public static void main(String[] args) {
		Random rd = new Random();
		int[] Lotto =new int[6];
		
		for(int i = 0;i < Lotto.length;i++) {
			Lotto[i] = (int)(Math.random()*45)+1;//난수생성	
			for(int j=0; j < i; j++) {
				if(Lotto[i] == Lotto[j]) {//중복제거부분
					i--;
				}
			}
		}
		
		System.out.println("오늘의 당첨번호");
		System.out.println("==========================");
		//for문을 이용해서 출력
		for(int i = 0;i < Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
		}
	}
}
