package com.urdomain.ch08.sec03;

import com.urdomain.ch08.sec02.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volunme) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volunme;
		}
		System.out.println("���� TV ����:"+ this.volume);
	}

}
