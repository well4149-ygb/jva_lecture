package com.urdomain.ch11.sec06;

public class Car1 {
	private String model;
	public String owner;
	
	public Car1() {
	}
	
	public Car1(String model) {
		this.model = model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	private void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
}
