package com.javaex.ex18;

public class Point implements Drawable{

	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//GS
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	//일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("[x = " + x + ", y = " + y + "] 점을 그렸습니다");
	}
	
}
