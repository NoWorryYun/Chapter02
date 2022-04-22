package com.javaex.ex06;

public class Goods {

	//필드
	
	private String name;
	private int price;

	
	//생성자
	public Goods() {	//void 같은거 쓰는 칸 없음 // 기본생성자(default 생성자)
		// 기본이기때문에 다른 생성자가 없다면 굳이 안써도딤
		//**********(매우중요) 메모리에 올리는 일(클래스를 인스턴스 화)
		//로직
		System.out.println("goods(0)");
		
	}
	
	public Goods(String name) {
		//**********(매우중요) 메모리에 올리는 일(클래스를 인스턴스 화)
		//추가로직
		this.name = name;
		System.out.println("Goods(1)");
	}
	
	public Goods(String name, int price) {
		//**********(매우중요) 메모리에 올리는 일(클래스를 인스턴스 화)
		//추가로직
		this.name = name;
		this.price = price;
		System.out.println("goods(2)");
	}
	
	
	//메소드 -gs
	

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//메소드 - 일반 html( 오래걸림 )
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}
