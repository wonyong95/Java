package day02;
import java.util.*;
public class IfTest2 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("2자리의 정수를 입력하세요=>");
		 int num=sc.nextInt();
		 
				 
		// 2자리 정수를 입력받으세요
			// 11, 22, 33, 44, 55,... 
			//==> "OK 10의 자리와 1의 자리가 같아요"
			//그렇지 않다면 No 10의 자리와 1의 자리가 달라요"
	    
		 if(num % 11==0){
			 System.out.println("OK 10의 자리와 1의 자리가 같아요");
		 }else {
			 System.out.println(" No 10의 자리와 1의 자리가 달라요");
           }
		 
		 String str=(num %11==0)? "OK 10의 자리와 1의 자리가 같아요" :" No 10의 자리와 1의 자리가 달라요";
		 System.out.println(str);
	}
  
}
