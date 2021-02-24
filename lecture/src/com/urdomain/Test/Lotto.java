package com.urdomain.Test;


import java.util.*;

public class Lotto {
//1.랜덤을 선언한다.
//2.로또에 해당하는 배열을 선언한다.
//3.반복문을 돌려서 랜덤으로 숫자를 넣는다.
//4.반복문내에서 중복처리를 한다.
//5.해당 배열을 출력한다.	

	public static void main(String[] args) {
		Random rd = new Random();
		int[] Lotto =new int[6];
		
		for(int i = 0;i < Lotto.length;i++) {
			Lotto[i] = (int)(Math.random()*45)+1;//랜덤으로 숫자를 생성	
			for(int j=0; j < i; j++) {
				if(Lotto[i] == Lotto[j]) {//중복되는 경우 처리
					i--;
				}
			}
		}
		
		System.out.println("오늘의 로또 번호");
		System.out.println("==========================");
		//해당 배열을 출력한다.(반복문을 사용)
		
		for(int i = 0;i < Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
		}
	}
}
