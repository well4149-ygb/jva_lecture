package com.urdomain.ch15.sec06.ex02QUEUE;

public class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command= command;
		this.to = to;
	}
}
