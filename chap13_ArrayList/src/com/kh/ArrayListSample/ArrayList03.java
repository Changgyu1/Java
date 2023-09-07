package com.kh.ArrayListSample;

import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		//사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
		//향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요!");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요!");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수를 입력해주세요!");
		int num3 = sc.nextInt();
		System.out.println("네 번째 정수를 입력해주세요!");
		int num4 = sc.nextInt();
		System.out.println("다 번째 정수를 입력해주세요!");
		int num5 = sc.nextInt();
		
		int[] number = {num1, num2, num3, num4, num5};
		
		for(int total : number) {
			sum += total;
		}
		System.out.println(sum);

	}

}
