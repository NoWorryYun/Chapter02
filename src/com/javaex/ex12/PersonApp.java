package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Person person = new Person("윤성한", 29);
		
//		System.out.println(person);
		person.showInfo();
		
		Student s01 = new Student("서울고등학교");
		System.out.println(s01.toString());
		
		Student s02 = new Student();
		s02.setAge(29);
		s02.setName("윤성한");
		s02.setSchoolname("서울고등학교");
		System.out.println(s02.toString());
		*/
//		System.out.println(s02);

		
		Student s03 = new Student("윤성한", 29, "남강고");
		
		System.out.println(s03.getName());
		System.out.println(s03.toString());
		s03.showInfo();
//		Student s03 = new Student("서울고등학교");
		
		
		
	}
	

}
