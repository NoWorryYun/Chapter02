package com.javaex.ex20;

import java.io.IOException;

public class MyFile {

	//필드
	
	
	
	
	//생성자
	public MyFile() {}
	
	
	
	//GS
	
	
	
	
	//일반
	//정상적인 경우
	public String read(String path) {
		//path에 있는 파일을 읽어서 문자열로 만들어준다
		String result = "학교종이 땡땡땡";
		
		return result;
		
	}
	//파일이 없는 경우
	public String read2(String path) {
		String result = "";
		try {
			//path에 있는 파일을 읽어서 문자열 만들어준다
			//파일 없을때
			throw new IOException();	//파일이 없는 상황을 강제로 발생
			
		} catch (IOException e) {
			System.out.println(path + "파일이 없습니다");
		}

		return result;
		
	
	}
	
	
	//파일이 없는 경우 -- 사용하는쪽에 예외를 알리는 경우
	public void read3(String path) throws IOException {
		String result = "";
		
		throw new IOException();	//파일이 없는 상황을 강제로 발생
		
	}
}
