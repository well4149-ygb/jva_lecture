package com.urdomain.Test;

public class TrainTicketing {
	// 필드
	String oneWay;// 편도
	String roundtrip;// 왕복
	String departure;// 출발
	String arrive;// 도착
	int year;
	int month;
	int day;
	int time;
	String age;// 연령
	String seat;// 좌석
	String option;// 옵션
	String purchaseregister;// 구매등록
	String trainsearch;// 열차 조회

	// 메서드

	// 출발일 조정
	public int changeDepartday(int year, int month, int day, int time) {
		// 출발일 조정
		return changeDepartday(0, 0, 0, 0);
	}

	// 좌석 및 연령 조정
	public String changeSeatandAge(String age, String seat) {
		return changeSeatandAge("24", "1");
	}

	// 출발,도착지 조정
	public String editDay(String departure, String arrive) {
		return editDay("서울", "대구");
	}

	// 간편구매등록
	public void register() {
		// 등록
	}

	// 열차조회
	public void trainsearch() {
		// 조회
	}

	public static void main(String[] args) {
		TrainTicketing tt = new TrainTicketing();

		tt.changeDepartday(2020, 12, 31, 14);
		tt.changeSeatandAge("30", "1");
		tt.register();// 간편구매등록
		tt.trainsearch();// 열차조회
	}
}
