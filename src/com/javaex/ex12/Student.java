package com.javaex.ex12;

public class Student extends Person {		//Person으로 Student가 포함(?)됨. 부모관계가 됨

	//필드
	private String schoolname;

	
	//생성자
	public Student() {
		System.out.println("Student1");
	}
	public Student(String schoolname) {
		this.schoolname = schoolname;
		System.out.println("Student2");
	}
	public Student(String name, int age, String schoolname) {
		super(name, age);
		this.schoolname= schoolname;
		System.out.println("Student3");
	}
	
	
	//GS
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	public String getSchoolname() {
		return schoolname;
	}
	
	//일반
	@Override
	public String toString() {
		return "Student [schoolname=" + schoolname + ", getName()=" + super.getName() + ", getAge()=" + this.getAge() + "]";
	}

}
