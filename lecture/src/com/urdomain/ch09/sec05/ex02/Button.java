package com.urdomain.ch09.sec05.ex02;

public class Button {
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	//�Ű� ������ ������
	void setOnClickListener(OnClickListener listner) {
		this.listener = listner;
	}
	//���� ��ü�� onClick()�޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
	//��ø �������̽�
	interface OnClickListener {
		void onClick();
	}
}
