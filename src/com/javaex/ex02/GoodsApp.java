package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 900000;
		
		Goods mug = new Goods();
		
		mug.name = "머그컵";
		mug.price = 2000;
		
		System.out.println("상품이름 : " + "\""+ camera.name + "\", " + "가격: " + camera.price);
		System.out.println("상품이름 : " + "\""+ computer.name + "\", " + "가격: " + computer.price);
		System.out.println("상품이름 : " + "\""+ mug.name + "\", " + "가격: " + mug.price);
		
		
	}

}
