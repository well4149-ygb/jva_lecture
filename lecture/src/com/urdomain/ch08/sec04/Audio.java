package com.urdomain.ch08.sec04;

import com.urdomain.ch08.sec02.RemoteControl;

public class Audio implements RemoteControl{
	//�ʵ�
	private int volume;
	private boolean mute;
	
	//turnOn(�߻� �޼����� ��ü �޼���)
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volunme) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����:"+this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		}else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
