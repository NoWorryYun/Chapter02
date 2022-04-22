package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point = new Point();
		
		point.setX(5);
		point.setY(5);
		
		Point point2 = new Point();
		
		point2.setX(10);
		point2.setY(23);
		
		
		Point point3 = new Point(10, 20);

		
		Point point4 = new Point(10);
		point4.setY(200);

		
		point.draw(true);
		point.draw(false);
		point.draw();
		point2.draw();
		point3.draw();
		point4.draw();
		
//		Point point5 = new Point(10);  //x와 구분 못함
//		point5.setX(200);
//		point5.draw();
	}

}
