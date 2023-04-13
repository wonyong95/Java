package day01;

public class Primitive1 {
	//실행: ctrl+F11
//	 커서 라인 삭제: ctrl+D
	public static void main(String[] args) {
		System.out.println("1. 기본 자료형 --------");
		//정수형 : byte < short < int[*] < long
		byte bt1=-128;
		byte bt2=127;
		System.out.println("bt1="+bt1);
		System.out.println("bt2="+bt2);
		short bt3=128; //short(2byte) : -2^15 ~ 2^15-1
		System.out.println("bt3="+bt3);
		short st1=25000;
		System.out.println("st1="+st1);
		int it1=5000000;//int(4Byte-32bit) -2^31 ~ 2^31-1
		System.out.println("it1="+it1);
		
		long ln1=40; //long(8byte-64bit) -2^63 ~ 2^63-1
		long ln2=40L;//뒤에 접미사 L, l 을 붙힌다
		System.out.printf("ln1=%d%n", ln1);
		System.out.printf("ln2=%d%n", ln2);
		
		int i=1000000000;
		long j=10000000000L;
		System.out.println("i="+i);
		System.out.println("j="+j);
//		ctrl+alt+방향키라애 : 현재 커서내용 복붙
		
		int a1=010;//8진수의 정수 . 8진수는 앞애 0을붙인다 (접두
		int a2=0x1ac;//16진수는 정수앞에 0x를 붙인다 0~9,a,b,c,d,e,f
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		
	}
   
}