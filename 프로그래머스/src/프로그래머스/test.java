package ���α׷��ӽ�;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		boolean isTrue = false;
		int black = 1;
		String blank = "��";
		String KingB = "��";
		String KingW = "��";
		Scanner sc = new Scanner(System.in);
		String[][] che = {{blank,blank,blank,blank,KingW,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,KingB,blank,blank,blank,blank}};
		System.out.println("==== �⺻���� ====");
		for(int i = 0; i <che.length; i++) {
			for(int a = 0; a<che[i].length; a++) {
				
				System.out.print(che[i][a] + " ");
			}
			System.out.println();
		} // �⺻ ����
		System.out.println("����� �����Դϴ�.");
		System.out.println("�� �� �� ���θ� ������ �� �ֽ��ϴ�.");
		while(!isTrue) {
			if(black == 1) {
				System.out.println("�� ����");
				String move = sc.next();
			
			switch(move) {
				case "��":
					for(int i = 0; i <che.length; i++) {
						for(int a = 0; a < che[i].length; a++) {							
							if(che[i][a] == KingB){
								
								che[i][a] = KingB;
								che[i][a] = blank;
								System.out.print(che[i][a] + " ");
								

						}
							
					}
						System.out.println();
			}
			
					black--;
					break;
				case "��":
					System.out.println("�� ��");
					black--;
					break;
				case "��":
					System.out.println("�� ��");
					black--;
					break;
				case "��":
					System.out.println("�� ��");
					black--;
					break;
				default:
					System.out.println("��,��,��,�� �� �Է°����մϴ�.");
					System.out.println("�ٽ� �Է����ּ���!");
			}
			
			} else {
				System.out.println("�� ����");
				String move = sc.next();
			
			switch(move) {
				case "��":
					System.out.println("�� ��");
					black++;
					break;
				case "��":
					System.out.println("�� ��");
					black++;
					break;
				case "��":
					System.out.println("�� ��");
					black++;
					break;
				case "��":
					System.out.println("�� ��");
					black++;
					break;
				default:
					System.out.println("��,��,��,�� �� �Է°����մϴ�.");
					System.out.println("�ٽ� �Է����ּ���!");
			}
			}
			
			
		}
		
		

		
		
		
		
	}
}
