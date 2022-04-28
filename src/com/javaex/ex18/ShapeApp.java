package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Point p01 = new Point(3, 5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(100, 100);
		p02.draw();
		
		System.out.println("-------------------------------");

		Rectangle r00 = new Rectangle("빨강", "검정", 1, 1);
		r00.draw();

		
		Shape r01 = new Rectangle("빨강", "검정", 3, 3);
		r01.area();
		//r01.draw(); 	<보이지않음
		
		Drawable r02 = new Rectangle("빨강", "검정", 2,2);
		r02.draw();
		//r02.area();	<보이지않음
		//r02.getWidth(); <보이지않음
	*/
		
		//배열선언
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Rectangle("빨강", "검정", 1, 1);
		Drawable r02 = new Circle("파랑", "검정", 3);
		Drawable r03 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8, 8);
		
		dArray[0]=r01;
		dArray[1]=r02;
		dArray[2]=r03;
		dArray[3]=p01;
		
		for(int i = 0 ; i < dArray.length ; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로값
		((Rectangle)dArray[0]).getWidth(); 
		
		//사각형의 면의 색
		((Shape)dArray[0]).getFillColor();
		
		System.out.println("=================================");
		
		System.out.println("배열을 통해서 면적 구하기");
		
		for(int i = 0 ; i < dArray.length ; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
			
			
//			double area = ((Shape)dArray[i]).area();
//			System.out.println(area);
		}
	}

}
