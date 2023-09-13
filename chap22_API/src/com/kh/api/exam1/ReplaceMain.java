package com.kh.api.exam1;

import java.util.Scanner;

public class ReplaceMain {

	public static void main(String[] args) {
		
		ReplaceMain replace = new ReplaceMain();
		//replace.replace1();
		//replace.replace2();
		//replace.replace3();
		//replace.replace4();
		//replace.replace5();
		replace.replaceAll();

		
		

	}
	
	public void replace1() {
		String input = "Hello, World!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : " + input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		// World => Java 로 교체
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello World";
		// o로 적혀있는 문자열들 x로 변경하기
		String input = originName.replace("o", "x");
		System.out.println(input);
		
	}
	
	public void replace4() {
		String originString = "The quick brown fox jups overthe lazy dog";
		// fox -> cat
		String input = originString.replace("fox", "cat");
		System.out.println(input);
		
	}
	
	public void replace5() {
		String originString = "The quick brown fox jups overthe lazy dog";
		// 모든 공백 제거하기
		String input = originString.replaceAll(" ", "");
		System.out.println(input);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace 대신 replaceAll 을 이용해서 대소문자 구분없이 문자열 Java로 치환하기
		String reAllstr = originString.replaceAll("(?i)world", "Java");
		System.out.println(reAllstr);
		
	}
	

	
}
