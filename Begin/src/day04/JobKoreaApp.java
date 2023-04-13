package day04;

import java.security.PublicKey;

/* 
 * [1] 구직자 클래스 구성해보기
 *          - 속성 : 3개이상
 *          -메서드  : 2개이상
 * [2] 회사 클래스 구성해보기
 *          -속성 : 3개이상
 *          -메서드 : 2개이상    
 *               
 * 클래스의 구성 요소
[1] 멤버변수
     <1> 인스턴스 변수 (non-static)
     <2> 클래스 변수 (static)
[2] 메서드
     <1> 인스턴스 메서드
     <2> 클래스 메서드

[3] 생성자 (Constructor)
     - 객체가 생성될 때 호출되는 메서드의 일종이다
     - new 연산자와 함께 사용
     - 생성자 이름은 클래스명과 동일해야 한다
     - 반환타입은 기술하지 않는다

     public 생성자이름([매개변수]){

     }
 * 
 * */


public class JobKoreaApp {
	public static void main(String[] args) {
		
		
		Job j1=new Job();		
		j1.age=27;
		j1.gender="남자";
		j1.career=3;
		j1.name="배정현";		
		String intro=j1.introduce();
		System.out.println(intro);
		
		String[] profiles= {"회계관리 3년"};
		String str=j1.projects(profiles);
		System.out.println(str);
		
		Job j2=new Job();
		j2.age=33;
		j2.gender="여자";
		j2.career=8;
		j2.name="박시현";
		
		System.out.println(j2.introduce());
		String[] profiles2= {"민원처리 8년"};
		System.out.println(j2.projects(profiles2));
		
	}

}
