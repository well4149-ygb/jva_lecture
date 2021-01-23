package com.urdomain.Test.Bending;

import java.util.Scanner;
//메서드를 리턴문으로 바꿀것
public class BendingMachine {
	  //필드
	  Scanner sc = new Scanner(System.in);
	  int sum      		 = 0;//구매한 물품의 합계
	  int remain   		 = 0;//잔돈
	  int input          = 0;//입력값
	  String brand       = null;//자판기의 브랜드
	  String manufactuer = null;//자판기의 제조일
	  String model 		 = null;//자판기의 모델명
	  Can[] can 		 = null;//캔 객체 
	  int[] stock 		 = null;//제고 초기화
	//String total       = null;//계산한 경우 총합
	
	//캔의 값을 설정하는 메소드
	public void setCan(Can[] can) {
			this.can = can;
	}
	//생성자
	public BendingMachine(){
		  this("삼성","2017.07.12","LVI-09S01K");
	}
	  
	public BendingMachine(String brand, String manufactuer ,String model) {
		  this.brand       = brand;
		  this.manufactuer = manufactuer;
		  this.model       = model;
		  
		  print("자판기 브랜드:" + brand);
		  print("자판기 제조일:" + manufactuer);
		  print("자판기 모델명:" + model);
		  print("----------------");
		  init();
	}
	  
	//초기화 메서드
	void init() {
	  	  String[] CanNameArr = {"코카콜라","사이다","솔의눈","펩시","환타","포카리","지코"};//음료7종류
	  	  int[] CanPriceArr  = {1000,1000,800,950,1200,1500,750};//각 음료의 가격->배열의 순서와 동일
	  	  int[] CanStockArr  = {10,10,10,10,10,10,10};//각 음료의 제고량
	  	
	  	  can   = new Can[CanNameArr.length]; 
		  stock = new int[CanStockArr.length];
		
		  for(int i=0; i < CanNameArr.length; i++) {
			  can[i] = new Can(CanNameArr[i],CanPriceArr[i],CanStockArr[i]);
		  }
		  for(int i=0;i<CanNameArr.length;i++) {
			  stock[i] = CanStockArr[i];
		  }
	}
    //메서드 부분
	  
	//일반 출력(문자열)
	public void print(String a) {
		System.out.println(a);
	}
	//일반 출력(정수형)
	public void print(int a) {
		System.out.println(a);
	}
	//에러 메시지1(자판기에서 잘못 입력했을 경우)
	String wrongInputMessage(){
		return "잘못 입력하셨습니다.";
	}
	//에러 메시지2(넣은 값을 초과했을 경우)
	String purcahseErrorMessage() {
		return"비용을 초과했습니다.";
	}
	//메뉴(종류와 가격)를 출력->o.k
	public void showmenu() {
  		print("-----메뉴-----");
  		for(int i = 0; i < can.length; i++) {
  			System.out.printf("%d. %s - (%d원)\n",i+1,can[i].getName(),can[i].getPrice());
  		}
  	}
	//돈을 넣는 행위
	public String inputMoney() {
		String result = null;

		print("자판기 입니다.");
		print("금액을 입력하세요.:");
		
		input = sc.nextInt();
		
		if(input < 700) {//금액이 적은 경우
			inputMoneyError();
			inputMoney();
		}
		if(input>700) {//조건을 충족하는 경우
			result = "메뉴를 보여줍니다.";
		}
		return result;
	}
	//넣은돈이 부족할 경우
    public void inputMoneyError() {
        if( input < can[6].getPrice()) {
      		print("금액이 부족합니다.");
      		print("금액을 더 넣어주세요.");
      	}
    }
    //음료구매시 에러(잔액부족)
    public String purchaseError(String purchaseErrorMessage) {
    	String result1 = null;
    	if(input < can[input].getPrice()) {
    		result1 = purchaseErrorMessage;
    	}
    	return result1;
    }
    //잘못 입력했을 경우의 에러
    public String wrongInput(String wrongInputMessage) {
    	String result2 = null;
    	if(input > can.length || input <0) {
    		result2 = wrongInputMessage;
    	}
    	return result2;
    }
//	//음료구매 
	public void purchaseItem() {
		
		while(true) {
			print("메뉴 선택(0:종료, 10:제고)");
			int select = sc.nextInt();
			
			if(select == 10) {//10번을 누른 경우
				for(int i =0; i<can.length;i++) {
					System.out.printf("%s의 남은 제고는 %d개 입니다.",can[i].getName(),stock[i]);
				}
				System.exit(0);
			}
			if(select ==0) {//0번을 누른 경우
				print("프로그램을 종료합니다.");break;
			}
			else if(input < can[select].getPrice()) {//금액이 모자라는 경우
				purcahseErrorMessage();
			}
			else if(input > can.length || input <0) {//버튼을 잘못 누른 경우
				wrongInputMessage();
			}
			else {//계산
				print(can[select-1].getName()+"을 선택했습니다.");
				sum+= can[select-1].getPrice();
				input -=can[select-1].getPrice();
				stock[select-1]--;
			}
		}
	}
	
	public void output() {//결과 계산
		
	}

}
 