package com.urdomain.ch07.sec02;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메서드
	void turnOnDumb() {
		System.out.println("체널:"+channel+"번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널:" + channel + "번호로 바꿉니다.");
	}
	
	void turnOffDumb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
}
