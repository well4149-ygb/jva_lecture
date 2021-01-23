package com.urdomain.Test.Bending;

import java.util.Scanner;
//�޼��带 ���Ϲ����� �ٲܰ�
public class BendingMachine {
	  //�ʵ�
	  Scanner sc = new Scanner(System.in);
	  int sum      		 = 0;//������ ��ǰ�� �հ�
	  int remain   		 = 0;//�ܵ�
	  int input          = 0;//�Է°�
	  String brand       = null;//���Ǳ��� �귣��
	  String manufactuer = null;//���Ǳ��� ������
	  String model 		 = null;//���Ǳ��� �𵨸�
	  Can[] can 		 = null;//ĵ ��ü 
	  int[] stock 		 = null;//���� �ʱ�ȭ
	//String total       = null;//����� ��� ����
	
	//ĵ�� ���� �����ϴ� �޼ҵ�
	public void setCan(Can[] can) {
			this.can = can;
	}
	//������
	public BendingMachine(){
		  this("�Ｚ","2017.07.12","LVI-09S01K");
	}
	  
	public BendingMachine(String brand, String manufactuer ,String model) {
		  this.brand       = brand;
		  this.manufactuer = manufactuer;
		  this.model       = model;
		  
		  print("���Ǳ� �귣��:" + brand);
		  print("���Ǳ� ������:" + manufactuer);
		  print("���Ǳ� �𵨸�:" + model);
		  print("----------------");
		  init();
	}
	  
	//�ʱ�ȭ �޼���
	void init() {
	  	  String[] CanNameArr = {"��ī�ݶ�","���̴�","���Ǵ�","���","ȯŸ","��ī��","����"};//����7����
	  	  int[] CanPriceArr  = {1000,1000,800,950,1200,1500,750};//�� ������ ����->�迭�� ������ ����
	  	  int[] CanStockArr  = {10,10,10,10,10,10,10};//�� ������ ����
	  	
	  	  can   = new Can[CanNameArr.length]; 
		  stock = new int[CanStockArr.length];
		
		  for(int i=0; i < CanNameArr.length; i++) {
			  can[i] = new Can(CanNameArr[i],CanPriceArr[i],CanStockArr[i]);
		  }
		  for(int i=0;i<CanNameArr.length;i++) {
			  stock[i] = CanStockArr[i];
		  }
	}
    //�޼��� �κ�
	  
	//�Ϲ� ���(���ڿ�)
	public void print(String a) {
		System.out.println(a);
	}
	//�Ϲ� ���(������)
	public void print(int a) {
		System.out.println(a);
	}
	//���� �޽���1(���Ǳ⿡�� �߸� �Է����� ���)
	String wrongInputMessage(){
		return "�߸� �Է��ϼ̽��ϴ�.";
	}
	//���� �޽���2(���� ���� �ʰ����� ���)
	String purcahseErrorMessage() {
		return"����� �ʰ��߽��ϴ�.";
	}
	//�޴�(������ ����)�� ���->o.k
	public void showmenu() {
  		print("-----�޴�-----");
  		for(int i = 0; i < can.length; i++) {
  			System.out.printf("%d. %s - (%d��)\n",i+1,can[i].getName(),can[i].getPrice());
  		}
  	}
	//���� �ִ� ����
	public String inputMoney() {
		String result = null;

		print("���Ǳ� �Դϴ�.");
		print("�ݾ��� �Է��ϼ���.:");
		
		input = sc.nextInt();
		
		if(input < 700) {//�ݾ��� ���� ���
			inputMoneyError();
			inputMoney();
		}
		if(input>700) {//������ �����ϴ� ���
			result = "�޴��� �����ݴϴ�.";
		}
		return result;
	}
	//�������� ������ ���
    public void inputMoneyError() {
        if( input < can[6].getPrice()) {
      		print("�ݾ��� �����մϴ�.");
      		print("�ݾ��� �� �־��ּ���.");
      	}
    }
    //���ᱸ�Ž� ����(�ܾ׺���)
    public String purchaseError(String purchaseErrorMessage) {
    	String result1 = null;
    	if(input < can[input].getPrice()) {
    		result1 = purchaseErrorMessage;
    	}
    	return result1;
    }
    //�߸� �Է����� ����� ����
    public String wrongInput(String wrongInputMessage) {
    	String result2 = null;
    	if(input > can.length || input <0) {
    		result2 = wrongInputMessage;
    	}
    	return result2;
    }
//	//���ᱸ�� 
	public void purchaseItem() {
		
		while(true) {
			print("�޴� ����(0:����, 10:����)");
			int select = sc.nextInt();
			
			if(select == 10) {//10���� ���� ���
				for(int i =0; i<can.length;i++) {
					System.out.printf("%s�� ���� ����� %d�� �Դϴ�.",can[i].getName(),stock[i]);
				}
				System.exit(0);
			}
			if(select ==0) {//0���� ���� ���
				print("���α׷��� �����մϴ�.");break;
			}
			else if(input < can[select].getPrice()) {//�ݾ��� ���ڶ�� ���
				purcahseErrorMessage();
			}
			else if(input > can.length || input <0) {//��ư�� �߸� ���� ���
				wrongInputMessage();
			}
			else {//���
				print(can[select-1].getName()+"�� �����߽��ϴ�.");
				sum+= can[select-1].getPrice();
				input -=can[select-1].getPrice();
				stock[select-1]--;
			}
		}
	}
	
	public void output() {//��� ���
		
	}

}
 