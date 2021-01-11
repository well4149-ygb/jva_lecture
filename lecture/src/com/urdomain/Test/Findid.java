package com.urdomain.Test;

import java.util.Scanner;

public class Findid {
	
	public static void main(String[] args) {
	  Findid.run();
	}
    
	String inputId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요.:");
		String name = sc.next();
		
		return name;
	}
	
	String inputEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력해주세요.:");
		String email = sc.next();
		
		return email;
	}
	
	public static void searchIdasteric(String Name , String Email) {
      
	  Findid fid = new Findid();
	  String[] user = {"well4149","well4149@naver.com","양경빈"};
      fid.inputId();
      
      String outputId = "well4149";
             outputId = outputId.replaceAll("well4149" , "wel***49");//소스참조하면서 공부하기
      String email    = "well4149@naver.com";
      
      	while(true) {
      		if(email.equals(fid.inputEmail())) {
      			System.out.println("귀하가 찾는 아이디는"+outputId+"입니다.");break;
      		}else{
      			System.out.println("이메일이 잘못 되었습니다.");
      		}
      	}
    }
	
	public static void run() {
		Findid fid = new Findid();
		Findid.searchIdasteric("양경빈", "well4149@naver.com");
	}
}
