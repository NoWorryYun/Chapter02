package com.javaex.ex14;

public class Ractangle {

	//필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Ractangle() {}
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor=lineColor;
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
		return "Ractangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	public void draw() {
		System.out.println("면색 : "+ fillColor + ", 선색 : " + lineColor + ", 가로 : " + width + ", 세로 : " + height + " 사각형을 그렸습니다.");
	}


}
