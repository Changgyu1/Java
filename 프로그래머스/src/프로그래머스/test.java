package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

   public static void main(String[] args) {
	   int[] number = {0, 31, 24, 10, 1};
	   int answer = 0;
	   String rsp = "2";
	   switch(rsp){
       case 2:
           answer = "0";
           break;
       case 0:
           answer = "5";
           break;
       case 5:
           anser ="2";
           break;
       default:  
   }
	   Arrays.sort(number); // 오름차순
	   
	   answer = number[number.length-2] * number[number.length-1];
	   System.out.println(answer);
       
       }
}
	 


       
		
	   
	   
	   


	   
