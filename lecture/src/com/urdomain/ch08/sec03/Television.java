package com.urdomain.ch08.sec03;

import com.urdomain.ch08.sec02.RemoteControl;

public class Television implements RemoteControl {
	//�ʵ�
	private int volume;
	
	@Override//turnOn() �߻� �޼����� ��ü �޼���
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ����:"+ this.volume);
	}

}
