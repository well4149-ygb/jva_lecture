package com.urdomain.ch13.sec07;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv,String,String> product = new ChildProduct<>();
		product.setkind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}
