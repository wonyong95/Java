package day01;
public class VarTest {

    int global=100;//인스턴스 변수
    static int global2=200;//클래스 변수 (전역변수)



    public static void main(String []args){
        //변수(variable, field, property)
        //변수 선언 :자료형 변수명
        int num1;//변수선언
        num1=10;//초기화

        int num2=8;//지역변수
        System.out.printf("num1=%d, num2=%d%n", num1, num2);

        System.out.printf("global2=%d%n", global2);
        System.out.printf("VarTest.global2=%d%n", VarTest.global2);

        //정수형 변수 a,b 두개선언하고 각자 값을 할당한뒤에 printf()이용해서 덧셈식과 곱셈식을 각각출력
        int a,b;
        a=6;
        b=7;
        System.out.printf("a+b=%d%n", a+b);
        System.out.printf("axb=%d%n", a*b);
        /* 변수 명명규칙
        1)명사형 ,소문자 ,카멜표기법
        2) 숫자로 시작해선안된다. 영문자,한글,한자
        3) 특수문자 사용불가 (예외. $,_)
        4) 예약어 사용불가
        */
        int wordCount=5;
        int word_count=6; 
        
        
    }
}
