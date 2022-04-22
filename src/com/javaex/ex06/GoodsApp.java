package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Goods computer = new Goods("LG그램", 900000);
		
//		Goods camera = new Goods("니콘", 400000);
		
		Goods camera = new Goods("니콘");
		camera.setPrice(400000);
		
		
		/*
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);;
		*/
		
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		
		
		
		
		
		/*
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		System.out.println("");
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		System.out.println("");
		
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
		System.out.println("");
		
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println("");
		
		*/
		
		computer.showInfo();
		camera.showInfo();
		cup.showInfo();
	}

}
