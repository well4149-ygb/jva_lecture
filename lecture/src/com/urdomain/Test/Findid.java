package com.urdomain.Test;

import java.util.Scanner;

public class Findid {
	
	public static void main(String[] args) {
	  Findid.run();
	}
    
	String inputId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ���.:");
		String name = sc.next();
		
		return name;
	}
	
	String inputEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸����� �Է����ּ���.:");
		String email = sc.next();
		
		return email;
	}
	
	public static void searchIdasteric(String Name , String Email) {
      
	  Findid fid = new Findid();
	  String[] user = {"well4149","well4149@naver.com","����"};
      fid.inputId();
      
      String outputId = "well4149";
             outputId = outputId.replaceAll("well4149" , "wel***49");//�ҽ������ϸ鼭 �����ϱ�
      String email    = "well4149@naver.com";
      
      	while(true) {
      		if(email.equals(fid.inputEmail())) {
      			System.out.println("���ϰ� ã�� ���̵��"+outputId+"�Դϴ�.");break;
      		}else{
      			System.out.println("�̸����� �߸� �Ǿ����ϴ�.");
      		}
      	}
    }
	
	public static void run() {
		Findid fid = new Findid();
		Findid.searchIdasteric("����", "well4149@naver.com");
	}
}
