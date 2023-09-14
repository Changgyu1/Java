package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	/*
	 * 
	 * StringTokenizer Ŭ���� : ���ڿ��� �и��ϴµ� ��� �־��� ������(�⺻:����)�� ������� ���ڿ��� ��ū���� �и�
	 * 
	 */
	public static void main(String[] args) {

		StringTokenizerMain stm = new StringTokenizerMain();

		// stm.STExam();
		// stm.STExam2();
		// stm.STExam3();
		// stm.STExam4();
		// stm.STExam5();
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
		// - �����ڸ� ����ؼ� text ����� - �����ڷ� ��� ����ϱ�
		String text = "apple-banana-grape-orange-kiwi-1-4-234";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");

		while (tokenizer.hasMoreTokens()) {
			String ggg = tokenizer.nextToken();
			System.out.println(ggg);
		}
	}

	public void STExam4() {
		// Ư�� �ܾ� �����ϰ� �����ڷ� �и�
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