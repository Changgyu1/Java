package com.kh.ArrayListSample;

import java.util.ArrayList;

public class ArrList01 {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		//ArrayList �̿��ؼ� ���ֳ����ĳ���
		color.add("��"); color.add("��"); color.add("��"); color.add("��");
		color.add("��"); color.add("��"); color.add("��");
		System.out.println("���� : " + color);
		
		//���� 3ȸ 1,3,5 ->��, ����, �׸� ����
		color.set(1, "��");
		color.set(3, "����");
		color.set(5, "�׸�");
		System.out.println("���� �� ���� : " + color);
		
		//���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
		color.add(1, "���ο�"); color.add(4, "�����Ķ�");
		System.out.println("���ϱ� �� ���� : " + color);
		
		//���� for�� �̿��ؼ� ���� ����ϱ�
		System.out.println("- ���� ��� -");
		for(String col : color) {
			System.out.println(col);
		}
		
		//�� �� ��� �� �� ��
		System.out.println("=======");
		color.remove(1); color.remove(1); color.remove(1); color.remove(1); color.remove(1); color.remove(2);
		System.out.println("�� �� ��� : " + color);

	}

}
