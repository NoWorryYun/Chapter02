package com.javaex.ex12;

public class Person {

	//필드
	protected String name;
	private int age;
	
	//생성자
	public Person() {
		System.out.println("Person1");
	}
	public Person(String name, int age) {
		System.out.println("Person2");
		this.name=name;
		this.age=age;
	}
	//GS
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	//일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}
