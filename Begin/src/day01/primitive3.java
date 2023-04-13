package day01;

public class primitive3 {
         public static void main(String[] args) {
        	 System.out.println("3.문자형------");
        	 
        	 
        	 
        	 
        	 char ch1='가';
//        	 char ch2='가나다';//[x]
//        	 String str="가나다";
        	 char ch2='W';
        	 
        	 print("ch1="+ch1);
        	 print("ch2="+ch2);
        	 
        	 char ch3='\uff57';//w
        	 print("ch3="+ch3);
        	 
        	 char c='A';//아스키 코드 :A(65) ,B(66)
        	 print("c+1="+(c+1));//66
        	 //char+int ==> 큰 자료유형으로 promotion됨
        	 
        	 //66을 문자로 출력하려면
        	 int n=c+1;
        	 print("n="+n);
        	 /*
     		 *  ====================>자동형변환(promotion)
     		 * byte< short <int < long < float <double
     		 * 		char
     		 * 
     		 *    <================= 강제형변환(casting)
     		 * */
        	 char c2=(char)n;
        	 //강제전환형(casting) : 큰 자료유형에서 작은 자료유형으로 변환하고자할때사용
        	 //            형변환 연산자()를 사용해야한다
        	 //   자료형 변수 = (자료형) 큰값
        	 print("c2="+c2);
        	 
        	 byte b1=10;
        	 byte b2=20;
        	 int b3=b1+b2;
        	 /*int보다 작은 유형의 데이터가 연산에 사용될 경우
        	  * 자동으로 int유형으로 형변환됨
        	  * */
        	 print("b3="+b3);
        	 
        	 char c1='G';
        	 char c22='P';
        	 char c3='X';
        	 
        	 System.out.println(c1+c22+c3);//GPX
        	 //char+char =>int
        	 
        	 byte b4=(byte)(b1+b2);
        	 //강제형변환해보기
        	 print("b4="+b4);
        	 
        	 print("4. 논리형(boolean)-----");
        	 boolean bool1=true;
        	 boolean bool2=false;
        	 boolean bool3=7>3;
        	 print("bool1="+bool1);
        	 print("bool2="+bool2);
        	 print("bool3="+bool3);
        	 
        	 
        	 
        	 
        	 
         }
         public static void print(String str) {
        	 System.out.println(str);
         }
         }

