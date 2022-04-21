package com.javaex.ex04;

public class Point {
//필드
	private int x;
	private int y;

	
//생성자
	
//getter/setter
	
	//setter
	public void setX(int num) {
		x = num;
	}
	public void setY(int num2) {
		y = num2;
	}
	
	//getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
//일반
	public void draw() {
		System.out.println("점[x=" + x +", "+"y="+y+"]을 그렸습니다.");
	}
}
