package day02;
import java.util.Scanner;
public class ItTest3 {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("나이를 입력하세요=>");
    	 int age=sc.nextInt();
    	 System.out.println("정가를 입력=>");
    	 int price=sc.nextInt();
    	 System.out.println("********");
    	 
    	 if(age<20) {
    		System.out.println("가격은"+(int)(price*0.9)+"원 입니다"); 
    	 }else {
			System.out.println("가격은"+price+"원 입니다");
		}
    	
    	 
    	 
    	 
    	 System.out.println("0~9999사이의 정수를 입력하세요=>");
    	 int num=sc.nextInt();
    	 int result=1;
    	 if(num>=0 && num<10) {
    		 result=1;
    	 }else if(num>=10&&num<100) {
    		 result=2;
    	 }else if(num>=100&&num<1000) {
    		 result=3;
    	 }else if(num>=1000&& num<10000){
    		 result=4;
         }
    	 System.out.println(result+"자리");
    	 
    	 
    	 
    	 
    	 
    	 }
    	 /*[2]
    	 가격과 나이를 입력받아 20세 미만이면 10%를 할인하여 가격을 알려주세요

    	 price=10000
    	 age=18
    	 가격은 9000원 입니다
    	 */
          
    	 		
    	 		/*[3]
    	 		 * 0~9999 사이의 정수를 입력받아서 입력받은 정수가 몇 자리인지 알려주세요.
    	 			 15 --->2  
    	 			 123--->3  
    	 			 7777-->4
    	 		 * */
		
	}
