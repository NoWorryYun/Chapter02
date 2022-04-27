package com.javaex.ex16;

public class Circle extends Shape {

	//필드
	private int radius;
	
	//생성자
	public Circle() {}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
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
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
		                        ", 반지름:" + radius +
		                        "] 원을 그렸습니다. " );
		}
	public double area() {
		double area = 3.14*radius*radius;
		return area;
	}
	
	
}
