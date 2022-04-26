package com.javaex.ex14;

public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//면색:빨강, 선색: 검정, 가로:4, 세로:4 사각형
		//면색:주황, 선색: 검정, 가로:5, 세로:5 사각형
		//면색:빨강, 선색: 검정, 가로:4, 세로:4 삼각형
		//면색:보라, 선색: 검정, 가로:10, 세로:10 삼각형
		//면색:보라, 선색: 빨강, 반지름 3 원
		//면색:보라, 선색: 검정, 반지름 3 원
		
		Ractangle[] ractangle = new Ractangle[2];
		Circle[] circle = new Circle[2];
		Triangle[] triangle = new Triangle[2];
		
		Ractangle rat1 = new Ractangle("빨강", "검정", 4, 4);
		Ractangle rat2 = new Ractangle("주황", "검정", 5, 5);
		Triangle tri1 = new Triangle("빨강", "검정", 4, 4);
		Triangle tri2 = new Triangle("보라", "검정", 10, 10);
		Circle cir1 = new Circle("보라", "빨강", 3);
		Circle cir2 = new Circle("보라", "검정", 3);
		
		ractangle[0]=rat1;
		ractangle[1]=rat2;
		triangle[0]=tri1;
		triangle[1]=tri2;
		circle[0]=cir1;
		circle[1]=cir2;
		
		
		for(int i = 0 ; i < ractangle.length ; i++) {
			ractangle[i].draw();
		}
		for(int i = 0 ; i < triangle.length ; i++) {
			triangle[i].draw();
		}
		for(int i = 0 ; i < circle.length ; i++) {
			circle[i].draw();
		}
		
		
	}

}
