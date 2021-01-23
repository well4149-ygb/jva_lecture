package com.urdomain.Test.Bending;

public class Can {
	private String name="";//ÄµÀÇ ÀÌ¸§
	private int price;//ÄµÀÇ °¡°Ý
	private int stock;//ÄµÀÇ Á¦°í
	
	public Can(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	
}
