package com.urdomain.ch10.sec07;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
