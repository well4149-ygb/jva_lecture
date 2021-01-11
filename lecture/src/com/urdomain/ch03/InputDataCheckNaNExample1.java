package com.urdomain.ch03;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
	 String userInput = "NaN";
	 double val = Double.valueOf(userInput);
	 
	 double currentBalance = 10000.0;
	 
	 currentBalance += val;
	 System.out.println(currentBalance);
	 
	 for(int i=2;i<=9;i++) {
		 for(int j =1;j<=9;j++) {
			 System.out.println(i);
		 }
	 }
	}
}
