package com.javaex.ex11;

public class Math {

	//필드
	private static final double pi = 3.14;
	
	
	
	//생성자
	
	
	
	//GS
	
	
	
	//일반
	public static int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static double plus(double a, double b) {
		double sum = a+b;
		return sum;
	}

	public static double circleArea(int radius) {
		double area = radius*radius*pi;
		return area;
	}
}
