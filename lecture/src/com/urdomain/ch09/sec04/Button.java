package com.urdomain.ch09.sec04;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listner) {
		this.listener = listner;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener {
		void onClick();
	}
}
