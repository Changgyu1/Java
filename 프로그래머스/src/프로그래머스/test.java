package ���α׷��ӽ�;

public class test {

   public static void main(String[] args) {
	   String[] str1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
	   int n = 3;
	   int count = 0;
	   
	   for(int i = 0; i < str1.length; i++) {
		   if(str1[i].charAt(str1.length-1) == str1[i+1].charAt(0)) {
			   System.out.println("����");
		   }else {
			   System.out.println("�ٸ�");
		   }
	   }
	   
	   
	   

	   System.out.println(str1[0].length());
	   System.out.println(str1[0].charAt(3));
	   
   }
}