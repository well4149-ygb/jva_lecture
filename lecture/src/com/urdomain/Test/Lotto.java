package com.urdomain.Test;


import java.util.*;

public class Lotto {
//	1.�ζǹ�ȣ ������(������ �̿��Ұ�)
//	->�迭�� �����Ѵ�.6��v
//	->������ ����Ѵ�. (������ 1~46������ �����Ѵ�.)v
//	->�ݺ����� ����ؼ� �ش� �迭�� ����ְ� ����Ѵ�.v
//	->�ݺ��� �ȿ� ���ǹ��� ����־ �ߺ��� �����Ѵ�.v
	//�ݺ������� �ش� �迭�� ����Ѵ�.v

	public static void main(String[] args) {
		Random rd = new Random();
		int[] Lotto =new int[6];
		
		for(int i = 0;i < Lotto.length;i++) {
			Lotto[i] = (int)(Math.random()*45)+1;//��������	
			for(int j=0; j < i; j++) {
				if(Lotto[i] == Lotto[j]) {//�ߺ����źκ�
					i--;
				}
			}
		}
		
		System.out.println("������ ��÷��ȣ");
		System.out.println("==========================");
		//for���� �̿��ؼ� ���
		for(int i = 0;i < Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
		}
	}
}
