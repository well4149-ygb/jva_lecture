package com.urdomain.ch08.sec04;

import com.urdomain.ch08.sec02.RemoteControl;
import com.urdomain.ch08.sec03.Audio;
import com.urdomain.ch08.sec03.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
