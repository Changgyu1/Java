package 프로그래머스;

public class test {

   public static void main(String[] args) {
	   int n = 12345;
	   int count = 0;
	   String str = Integer.toString(n);
	   String[] arr = str.split(""); // 1,2,3,4,5
	   String[] answer = new String[str.length()];
	   
	   for(int i = str.length()-1; i >= 0; i--) {
		   answer[count] = arr[i];
		   count++;
	   }
	   for(String a : answer) {
		   System.out.println(a);
       }
   }
}
	 


       
		
	   
	   
	   


	   
