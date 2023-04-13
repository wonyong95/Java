package day04;
/* 멤버변수
 * [1] 인스턴스 변수 (non static)
 * [2] 클래스변수 (static)
 * */


public class YourDemo {
	String str="YourDemo's Variable";
	float pi;//instance변수 "객체명.변수"식으로 접근한다
	
	static String CMD="static Varialbe";
	//class 변수 "클래스명.변수"식으로 접근
	
	public YourDemo() {
		pi=3.14f;
	}

}
