package com.urdomain.ch08.sec03;

import com.urdomain.ch08.sec02.RemoteControl;

public class Audio implements RemoteControl {
	//ÇÊµå
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
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
		System.out.println("ÇöÀç TV º¼·ý:"+ this.volume);
	}

}
