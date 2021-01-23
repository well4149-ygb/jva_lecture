package com.urdomain.ch08.sec03;

import com.urdomain.ch08.sec02.RemoteControl;

public class Television implements RemoteControl {
	//필드
	private int volume;
	
	@Override//turnOn() 추상 메서드의 실체 메서드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volunme) {
		if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volunme;
		}
		System.out.println("현재 TV 볼륨:"+ this.volume);
	}

}
