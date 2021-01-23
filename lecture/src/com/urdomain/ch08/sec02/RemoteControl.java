package com.urdomain.ch08.sec02;

public interface RemoteControl {
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼���
	public void turnOn();
	public void turnOff();
	public void setVolume(int volunme);
	
	//����Ʈ �޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼��� 
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}