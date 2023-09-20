package 프로그래머스;

public class test {

	public static void main(String[] args) {
		test a = new test();
		a.practice1();
		/*
		int num1 = 0;
		int num2 = 0;
	   String[][] n = new String[4][4];
	   for(int i = 0; i < n.length; i++) {
		  
		   for (int j = 0; j< n[i].length; j++) {
			   
			   System.out.print("(" + i + "," + j + ")");
		   }
		   System.out.println();
		}
	   */
   }
	public void practice1() {
		 int[][] n = new int[4][4];
		 int count = 0;
		   for(int i = 0; i < n.length; i++) {
			   for (int j = 0; j< n[i].length; j++) {
				   n[i][j] = (int) (Math.random()*10 + 1);
				   if(j == 3) {
					   n[i][j] = n[i][0] + n[i][1] + n[i][2];
				   } else if (i == 3) {
					   n[i][j] = n[0][j] + n[1][j] + n[2][j];
				   } 
				   if (i==3 && j ==3) {
					   n[3][3] = n[0][3] + n[1][3] + n[2][3] + n[3][0] + n[3][1] + n[3][2];
				   }
				 
				   System.out.print(n[i][j]+", ");
			   }
			   System.out.println();
		   }
		   System.out.println(n.length);
	}
}
