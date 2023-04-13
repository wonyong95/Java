package day02;
/* 변수가 선언된 위치따른 변수 유형
 * [1] 멤버 변수
 *          <1>non-static: 인스턴스변수 "객체명.변수" 식으로 접근
 *          <2>static    : 클래스 변수 "클래스명.변수" 식으로접근
 * [2] 지역 변수 : 초기화하지 않고 사용하면 에러 발생한다
 * */

public class DataType {
	
	byte b; // 멤버변수(member variable)-인스턴스변수
	static byte c=9;//멤버변수-클래스변수
	       short s;//0
	       char ch;//'\u0000'
	       int i;//0
	       long l;//0L
	static float f;//0.0f
	       double d;//0.0
	       boolean bool;//false
	 static String str;//참조형 null
	
	public static void main(String[] args) {
		int k=5;// 지역변수(local variable): 초기화한뒤 사용해야함
		System.out.println("DataType.c:"+DataType.c);
	//	System.out.println(b); [x]
		
		//객체생성
		DataType dt=new DataType();//dt :객체명
		System.out.println("dt.b:"+dt.b);
		
		System.out.println("k:"+k);
		System.out.println(dt.s);
		System.out.println(dt.ch);
		System.out.println(dt.i);
		System.out.println(dt.l);
		System.out.println(DataType.f);
		System.out.println(dt.d);
		System.out.println(dt.bool);
		System.out.println(DataType.str);
	}

}
