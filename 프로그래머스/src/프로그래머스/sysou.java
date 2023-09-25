package 프로그래머스;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sysou {

	public static void main(String[] args) {
		boolean isTrue = false;
		int black = 1;
		String blank = "□";
		String KingB = "♠";
		String KingW = "♤";
		char[] ah = new char[8];


		String[][] che = { { blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, KingW, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, KingB, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank } };

		while (!isTrue) {
			for (int i = 0; i < che.length; i++) {
				for (int a = 0; a < che.length; a++) {
					if (che[i][a].contains(KingB) && che[i][a].contains(KingW)) {
						System.out.println(che[i][a].equals(KingB));
						isTrue = true;
					} else {
						System.out.println(che[i][a].contains(KingB));
						isTrue = true;
					}
				}
			}
			System.out.println("입력");
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			System.out.println(a);
		}

	}

}
