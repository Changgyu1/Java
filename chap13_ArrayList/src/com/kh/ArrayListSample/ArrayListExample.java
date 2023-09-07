package com.kh.ArrayListSample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//�� ArrayList ����
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : " + fruits); //fruits : []
		
		//��� �߰�
		fruits.add("���");
		System.out.println("��� �߰� : " + fruits); //fruits : [���]
		
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰� : " + fruits);
		
		fruits.add("����");
		System.out.println("���� �߰� : " + fruits);
		
		//��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		//�ε����� ����Ͽ� ��ҿ� ��������
		String firstFruits = fruits.get(0);
		System.out.println("ù ��° ���� : " + firstFruits);

		//��� �����Ұž�
		fruits.set(0, "����");
		System.out.println("����üũ : " + fruits);
		
		//��� ����
		fruits.remove(0);
		System.out.println("�ٳ��� ���� Ȯ�� : " + fruits);
		
		System.out.println("==========================");
		
		//ArrayList ��ȸ�ؼ� ������
		System.out.println("- ��� ���� ��� -");
//	for(��ҵ�����Ÿ��) ���Һ����� : ����̵���ִ� ������) {
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("==========================");
		
		//�ߺ��� ���� ����
		//ArrayList ����
		fruits.clear();
		System.out.println("��� ���� ������ �� : " + fruits);
		
		
	}

}