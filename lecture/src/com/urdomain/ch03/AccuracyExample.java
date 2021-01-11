package com.urdomain.ch03;

public class AccuracyExample {
public static void main(String[] args) {
 int apple= 1;
 
 int totalPieces = apple *10;
 int number = 7;
 int temp = totalPieces -number;
 
 double result = temp/10.0;
 
 System.out.println("사과 한개에서");
 System.out.println("0.7개의 조각을 빼면");
 System.out.println(result+"조각이 남습니다.");
}
}
