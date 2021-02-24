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
		String       id = "well4149";//���̵�
		String password = "11111";// �н�����
		
		System.out.println("�α���");
		System.out.print("���̵� �Է����ּ���.");
		String inputid = sc.next();
		
		System.out.print("��й�ȣ�� �Է����ּ���.");
		String inputpw = sc.next();
		
			if(id.equals(inputid) && password.equals(inputpw)) {//�α��� �߿�κ�
				System.out.println("�α����� �Ǿ����ϴ�.");
			}else {
				System.out.println("���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		
		sc.close();
	}
	
	void run() {
		//Login log = new Login();
		login("well4149", "11111");
	}
}

