package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	/*
	 * 
	 * StringTokenizer 클래스 : 문자열을 분리하는데 사용 주어진 구분자(기본:공백)를 기분으로 문자열을 토큰으로 분리
	 * 
	 */
	public static void main(String[] args) {

		StringTokenizerMain stm = new StringTokenizerMain();

		stm.STExam();
		stm.STExam2();
		stm.STExam3();
		stm.STExam4();
		stm.STExam5();
		stm.toMath();

	}

	public void STExam() {
		String text = "Apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		System.out.println(tokenizer.countTokens());
		// hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}

	public void STExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");

		while (tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}

	public void STExam3() {
		// - 구분자를 사용해서 text 만들고 - 구분자로 끊어서 출력하기
		String text = "apple-banana-grape-orange-kiwi-1-4-234";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");

		while (tokenizer.hasMoreTokens()) {
			String ggg = tokenizer.nextToken();
			System.out.println(ggg);
		}
	}

	public void STExam4() {
		// 특정 단어 제외하고 구분자로 분리
		String text = "This is a test. But not a real one";
		StringTokenizer tokenizer = new StringTokenizer(text, " .");

		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if (!word.equals("test")) {
				System.out.println(word);
			}
		}
	}

	public void STExam5() {
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date, "-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("Year : " + year);
		System.out.println("Month : " + month);
		System.out.println("Day : " + day);
	}

	public void toMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")){
				System.out.println("Number : " + token);
			}
			
		}
		
	}
}
