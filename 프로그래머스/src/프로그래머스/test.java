package 프로그래머스;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		boolean isTrue = false;
		int black = 1;
		String blank = "□";
		String KingB = "♠";
		String KingW = "♤";
		Scanner sc = new Scanner(System.in);
		String[][] che = {{blank,blank,blank,blank,KingW,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,blank,blank,blank,blank,blank},
						{blank,blank,blank,KingB,blank,blank,blank,blank}};
		System.out.println("==== 기본셋팅 ====");
		for(int i = 0; i <che.length; i++) {
			for(int a = 0; a<che[i].length; a++) {
				
				System.out.print(che[i][a] + " ");
			}
			System.out.println();
		} // 기본 셋팅
		System.out.println("흑먼저 움직입니다.");
		System.out.println("앞 뒤 옆 으로만 움직일 수 있습니다.");
		while(!isTrue) {
			if(black == 1) {
				System.out.println("흑 차례");
				String move = sc.next();
			
			switch(move) {
				case "앞":
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
				case "뒤":
					System.out.println("흑 앞");
					black--;
					break;
				case "좌":
					System.out.println("흑 앞");
					black--;
					break;
				case "우":
					System.out.println("흑 앞");
					black--;
					break;
				default:
					System.out.println("앞,뒤,좌,우 만 입력가능합니다.");
					System.out.println("다시 입력해주세요!");
			}
			
			} else {
				System.out.println("백 차례");
				String move = sc.next();
			
			switch(move) {
				case "앞":
					System.out.println("흑 앞");
					black++;
					break;
				case "뒤":
					System.out.println("흑 앞");
					black++;
					break;
				case "좌":
					System.out.println("흑 앞");
					black++;
					break;
				case "우":
					System.out.println("흑 앞");
					black++;
					break;
				default:
					System.out.println("앞,뒤,좌,우 만 입력가능합니다.");
					System.out.println("다시 입력해주세요!");
			}
			}
			
			
		}
		
		

		
		
		
		
	}
}
