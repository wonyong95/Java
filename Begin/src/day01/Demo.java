package day01;
//Demo.java(파일명)==클래스명이 같아야함(대소문자까지도)
public class Demo{
    //main()메서드
    public static void main(String[] args){
        System.out.println("Hi Java~");
        System.out.println("안녕 자바");
        System.out.println("반갑습니다");
        System.out.println("저는 백엔드 개발자 과정\n윤원용입니다 ");
        /* escape 문자
           \n : 개행문자 (줄바꿈이 일어난다)
           \t : 탭키만큼 띄어쓰기를 한다
           \" : 쌍따옴표를 출력하고자 할때 사용
           \' : 홑따옴표  ///
           \\ : 역슬래시(\)를 출력하고자 할때
           \r : 캐리지 리턴. 커서를 맨 앞으로 이동시킨다
         
         */
         System.out.println("---------------------");
         System.out.println("국어\t영어\t수학");
         System.out.println("---------------------");
         System.out.println("99\t88\t75");
         System.out.println("---------------------");

         
         System.out.println("김소월 님의 \'진달래 꽃\'");
         System.out.println("\"나보기가 역겨워 가실 떄에는 말없이 고이 보내 드리오리다\"");
         System.out.println("Hello World\rA");
         System.out.println("역슬래시 (\\)");




    }//main()
    

    
     
}//class end
/*
Demo.java(원시코드)
[1] 컴파일 (문법체크) 
     c:\myjava>javac Demo.java
     ==> Demo.class  (byte code) jvm이 이해할수 있는 코드
[2] 실행(인터프리터)   
     ==>java Demo
     ==>output
*/ 