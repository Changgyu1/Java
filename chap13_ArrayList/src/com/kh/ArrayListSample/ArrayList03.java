package com.kh.ArrayListSample;

import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		//����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
		//���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է����ּ���!");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է����ּ���!");
		int num2 = sc.nextInt();
		System.out.println("�� ��° ������ �Է����ּ���!");
		int num3 = sc.nextInt();
		System.out.println("�� ��° ������ �Է����ּ���!");
		int num4 = sc.nextInt();
		System.out.println("�� ��° ������ �Է����ּ���!");
		int num5 = sc.nextInt();
		
		int[] number = {num1, num2, num3, num4, num5};
		
		for(int total : number) {
			sum += total;
		}
		System.out.println(sum);

	}

}
