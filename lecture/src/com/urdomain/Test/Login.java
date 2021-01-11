package com.urdomain.Test;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Login login  = new Login();
		login.run();
			
	}
	
	public void login(String name, String pw) {
		Scanner      sc = new Scanner(System.in);
	    String[]   user = {"well4149","11111"};
		String       id = "well4149";//아이디
		String password = "11111";// 패스워드
		
		System.out.println("로그인");
		System.out.print("아이디를 입력해주세요.");
		String inputid = sc.next();
		
		System.out.print("비밀번호를 입력해주세요.");
		String inputpw = sc.next();
		
			if(id.equals(inputid) && password.equals(inputpw)) {//로그인 중요부분
				System.out.println("로그인이 되었습니다.");
			}else {
				System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
			}
		
		sc.close();
	}
	
	void run() {
		Login log = new Login();
		log.login("well4149", "11111");
	}
}

