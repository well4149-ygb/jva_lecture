package com.urdomain.Test;

public class TrainSearch {
 //   필드3-1.열차 조회 기능
//	     속성:열차종류,
//           출발,
//           도착,
//           좌석종류  
//           직통
//	         날짜(연도,월,일)
//기능->열차선택 기능 , 좌석종류 선택
//        일반실 특실 구매 기능
    
	//필드
	static String[]train= {"무궁화호","KTX","새마을호","itx-청춘"};//열차종류
	static String[]seat= {"일반석","유아동석","휠체어석","2층석","자전거","대피도우미"};//좌석종류
	String  depart;//출발
	String  arrive;//도착
	int     year;//연도
	int     month;//월
	int     day;//일
	
	
	//메서드(기능)
	public int editDays(int year, int month, int day) {//날짜조정기능
		return editDays(2021,1,1);
	}
	
	public String trainselect(String[]train) {//열차 선택기능
		return trainselect(train);
	}
	
	public String seatselect(String[]seat) {//열차 좌석종류
		return seatselect(seat);
	}
	
	public void purchaseSeat() {
	  //구매	
	}//좌석구매기능
	
	public static void main(String[] args) {
		TrainSearch ts = new TrainSearch();
		ts.editDays(2021, 1, 1);
		ts.seatselect(seat);
		ts.trainselect(train);
		ts.purchaseSeat();
	}
}
