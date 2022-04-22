package com.javaex.ex03;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	
	//메소드 - gs
	public void setName(String name) {		//name의 변경
		this.name = name;					//this.[] 본인의 이름에 맞는 name _ 이름이 헷갈리기때문에 같은 이름을 사용할 땐 this를 붙여줌
	}
	
	public void setPrice(int price) {		//alt shift s 누르면 generate getter/ setter 하면 자동생성 가능
		if(price < 0) {
			price = 0;
		}else {
		this.price = price;
		}
		}
	
	public String getName() {			//name 가져오기
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격 : " + price);
		System.out.println();
	}
}
