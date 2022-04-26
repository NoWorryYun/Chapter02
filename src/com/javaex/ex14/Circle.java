package com.javaex.ex14;

public class Circle {

	//필드
	private int radius;
	private String fillColor;
	private String lineColor;
	
	//생성자(2개)
	public Circle() {}
	public Circle(String fillColor, String lineColor, int radius) {
		this.fillColor = fillColor;
		this.lineColor=lineColor;
		this.radius = radius;
	}
	
	//GS
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}

	//일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	public void draw() {
		System.out.println("면색 : "+ fillColor + ", 선색 : " + lineColor + ", 반지름 : " + radius + " 원을 그렸습니다.");
	}

	
}
