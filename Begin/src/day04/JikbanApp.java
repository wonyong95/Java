package day04;

import java.awt.geom.Path2D;

//애플리케이션
/* 직방프로그램 필요한 객체
 * -집
 * -매도자,  매수자 ,중개인 ,임대인 ,임차인
 * 객체를 프로그램 세계로 끌어들이는것 => 추상화(필요한 특징만 부각시켜서 클래스로옮긴다)
 * */
public class JikbanApp {
	public static void main(String[] args) {
		//단위테스트 (unit test)
		//클래스 : 객체를 만들어내는 틀
		//객체 : 클래스를 통해 만들어지는 구현물
		//현실세계에 존재하는 객체(Objext,Istance)==> 프로그램에서 객체를 생성해서 메모리에올림
		House h1=new House(); //Objext,Istance
		House h2=new House();
		//non-static메서드 : 객체명.메서드명()
		h1.owner="윤월용";
		h1.room=3;
		h1.addr="북구 매곡동";
		
		h2.owner="혀니";
		h2.room=2;
		h2.addr="북구 달천동";
		
		
		h1.printInfo();
		
		h2.printInfo();
		
		House h3=h1;
		
		h3.printInfo();
		
		House h4=new House();
		h4.owner="윤원용";
		h4.room=5;
		h4.addr="울산 삼산동";
		
		h4.printInfo();
		
		String info=h4.existAt(100);
		System.out.println(info);
				
		String sss=h1.rent(1, 5000);
		System.out.println(sss);
		
		System.out.println(h2.rent(2, 3000));
		
		System.out.println(h4.rent(3, 50));
		
	}

}
