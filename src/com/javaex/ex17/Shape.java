package com.javaex.ex17;

public abstract class Shape {

	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}


	
	//GS
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}

	
	//일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public abstract void draw();
	
	public abstract double area();
	
	
}
