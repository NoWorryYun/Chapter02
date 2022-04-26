package com.javaex.ex13;

public class ColorPoint extends Point {

	//필드
	private String color;
	
	
	//생성자
	public ColorPoint() {}
	public ColorPoint(String color) {
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	//GS
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	//일반
	public void showInfo() {
		System.out.println("color = " + color);
	}
	public void showInfo2() {
		System.out.println("x = " + super.getX() + ", y = " + super.getY() + ", color = " + this.color);
	}
}
