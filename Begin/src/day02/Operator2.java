package day02;

public class Operator2 {
	public static void main(String[] args) {
		System.out.println("논리부정 연산자(!) -----");
		//논리식 ,논리값에만 사용된다. true=> false , false =>true
		boolean b1=false;
		print("b1="+b1);
		print("!b1="+(!b1));
		print("!(2<4)="+(!(2<4)));
		/* = : 대입연산자
		 * ==: 비교연산자
		 * ===: 자바에없음
		 * 비교연산자(==)
		 *  [1] 기본자료형 : 값이 같은지를 비교한다
		 *  [2] 참조형 : 주소값이 같은지를 본다
		 *  
		 *  != :
		 *  [1] 기본자료형 : 값이 다른가? 다르면 true, 같으면 false
		 *  [2] 참조형 : 주소값이 다른가?
		 * */
		int x=5;
		float y=5.0f;
		print("x==y:"+(x==y));//값비교
		print("x!=y:"+(x!=y));
		
		String s1="Hello"; //literal pool
		String s2=new String("Hello"); //heap
		print("s1==s2:"+(s1==s2));//주소값비교
		print("s1!=s2:"+(s1!=s2));
		
		//String 메서드
		//public boolean equals(Object o): 문자열의 내용을 비교한다
		//문자열 내용이 같으면 true반환,내용다르면 false 반환
		boolean bool=s1.equals(s2);
		print("s1.equals(s2):"+bool);
		print("!s1.equals(s2):"+(!s1.equals(s2)));
		
	}//main
	public static void print(String str) {
		System.out.println(str);
	}

}
