package com.javaex.ex18;

public class Rectangle extends Shape implements Drawable{
	
	//필드
	private int width;
	private int height;

	
	//생성자
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	//GS
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}


	//일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
		                        ", 가로:" + width + ", 세로:" + height + 
		                        "] 사각형을 그렸습니다. " );
		}
	
	public double area() {
		double area = width*height;
		return area;
	}
}
