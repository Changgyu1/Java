package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		/*
		 - Array
		 - ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		   
		   ������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ� 
		   �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		   �迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ���
		   �������������� ���� �ٷ� �� �ֵ��� ������
		 - �迭�� ����
		    �迭�� ���� �� �ʱ�ȭ
		    ������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
		    
		 - Ư¡ :
		 - 1. ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ ����������
		 				  ���� �� ũ�⸦ ������ �� ����
		 - 2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ �Ѵ�.
		                      ex) intŸ���� �迭�� ��� ��Ұ� ���� �̿��� �Ѵ�.
		 - 3. index ��� ���� : �� �迭 ��Ҵ� �������� �ε����� ������
		 					  0���� �����ؼ� �迭 ũ�� -1������ ���� ����
		 					  �ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ����
		 					  ex) �迭ũ�� = 5�� ��ٸ� index�� 0 ~ 4
		 - 4. �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�.
		 
		 */
		
		int score1, score2, score3, score4, score5;
		// score�� 5������ ���߿� score�� 1000�� ���? => �迭���
		int[] score = new int[5]; // int Ÿ�� �迭 ����
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		String[] stringArray = new String[4];
		//String[] stringArray = {"", "", "", "", ""};
		stringArray[0] = "��";
		System.out.println("stringArray : " + stringArray[0]);
		stringArray[1] = "��";
		System.out.println("stringArray : " + stringArray[1]);
		stringArray[2] = "��";
		System.out.println("stringArray : " + stringArray[2]);
		stringArray[3] = "��";
		System.out.println("stringArray : " + stringArray[3]);
		
		
		
		
				 //�ڸ���ȣǥ     0       1       2
		String[] nameArray = {"��â��","ȫ�浿","�谳��"};
		System.out.print("nameArray[0] : " + nameArray[0] + " | ");
		System.out.print("nameArray[1] : " + nameArray[1] + " | ");
		System.out.print("nameArray[2] : " + nameArray[2]);
		System.out.println();

		
		String[] food = {"����", "����", "����", "�Ұ���"};
		int foodLength = food.length;
		System.out.println("food �迭�� ���� : " + foodLength);

		

	}

}