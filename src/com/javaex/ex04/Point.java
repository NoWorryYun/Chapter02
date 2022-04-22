package com.javaex.ex04;

public class Point {
//필드
	private int x;
	private int y;

	
//생성자
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}
	
	
	
//	public Point(int y) {	//같은 변수가 오면 구분 못함 ( int, String ) , ( String, int)처럼 서로 다른때만 구분 가능
//		this.y = y;			// 모든 경우의 수는 구분이 불가
//	}
	
	
//getter/setter
	
	//setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y  = y;
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
	
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + x +", "+"y="+y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x +", "+"y="+y+"]을 지웠습니다.");
		}
	}
}
