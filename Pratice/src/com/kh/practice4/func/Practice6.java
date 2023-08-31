package com.kh.practice4.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

	}

}
