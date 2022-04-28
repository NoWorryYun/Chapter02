package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//Shape은 추상클래스 > 추상클래스는 메모리에 올라가면 안됨
//		Shape s = new Shape("빨강", "검정");

		Rectangle r = new Rectangle("빨강", "검정", 100, 1000);
		
		//Shape 배열 생성
		Shape[] sArray = new Shape[6];
		
		//사각형 2개
		Shape r01 = new Rectangle("빨강", "검정", 4, 4);
		Shape r02 = new Rectangle("주황", "검정", 5, 5);
		
		//원
		Shape c01 = new Circle("노랑", "검정", 6);
		Shape c02 = new Circle("초록", "검정", 7);
		
		//삼각형
		Shape t01 = new Triangle("검정", "초록", 8, 8);
		Shape t02 = new Triangle("파랑", "초록", 9, 9);
				
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;

//		System.out.println(sArray[0].toString());
		for(int i = 0 ; i < sArray.length ; i++) {
			sArray[i].draw();
			System.out.println("면적: "+sArray[i].area());
		}
	}

}
