package com.urdomain.Test;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		function f = new function();
		f.gugudan(5, 9);
	}
    int inputnum1() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("숫자를 입력하세요. :");
    	int num1= sc.nextInt();
    	sc.close();
    	return num1;
    }
    
    int inputnum2() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("숫자를 입력하세요. :");
    	int num2= sc.nextInt();
    	sc.close();
    	return num2;
    }
    
	int gugudan(int num1, int num2) {

		int result = 0;
		System.out.println("구구단 출력 프로그램입니다.");

		for (int i = num1; i <= num1; i++) {
			for (int j = 1; j <= 9; j++) {
				result = j * num1;
				System.out.println(num1 + "*" + j + "=" + result);
			}
			

		}
		System.out.println("-------------------");
		
		for (int i = num2; i <= num2; i++) {
			for (int j = 1; j <= 9; j++) {
				result = j * num2;
				System.out.println(num2 + "*" + j + "=" + result);
			}
		}
		return result;
	}
}
