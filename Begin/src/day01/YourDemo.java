package day01;
// 1. 패키지 선언문 : package 패키지명;
//package my.com;
// 2. import문  : import 패키지명.클래스명;
import java.util.*;


public class YourDemo {
      public static void main(String[] args){
         System.out.println("---YourDemo-----");
         Date d=new Date();//java.util패키지에있음
         System.out.println(d);
         UUID uid=UUID.randomUUID();
         System.out.println(uid);

        //  System.out.printf("출력서식",출력할내용들);
        //출력 서식 %지시자
		/* %d : 정수형식으로 출력
		 * %f : 소수점 형식으로 출력
		 * %s : 문자열 형식으로 출력
		 * %b : boolean형식으로 출력
		 * %n : 줄바꿈
		 * */
         System.out.printf("제 이름은 %s이고 제 나이는 %d세입니다%n","윤원용",28);
         System.out.printf("제 평균 성적은 %f입니다\n",95.333333);

         double avg=95.3333;
         double avg2=Math.round(avg*100)/100.0;
         System.out.println(avg2);

         System.out.printf("평균성적: %.2f\n",95.33333);
 
         //오른쪽 정렬
         System.out.printf("%d%n",1);//1자리를 차지하고 1을출력
         System.out.printf("%5d%n",1);//5자리를 차지하고 1을출력
         System.out.printf("%5d%n",10);//5자리를 차지하고 1을출력
         System.out.printf("%5d%n",100);//5자리를 차지하고 1을출력
         
         //-를 사용하면 왼쪽정렬이된다
         System.out.printf("%-5d%n",1);//5자리를 차지하고 1을출력
         System.out.printf("%-5d%n",10);//5자리를 차지하고 1을출력
         System.out.printf("%-5d%n",100);//5자리를 차지하고 1을출력

         System.out.printf("%05d%n", 100);
         //앞의공간을 0으로채움




      }
    
}
