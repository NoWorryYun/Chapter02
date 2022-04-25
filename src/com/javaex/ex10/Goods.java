package com.javaex.ex10;

public class Goods {

	//필드
	private String name;
	private int price;
	public static int count;

	
	//생성자
	public Goods() {
		this.count = count+1;
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.count = count+1;
	}


	
	//GS
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	
	//일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
}
