package day04;

public class MyDemoTest {
	public static void main(String[] args) {
		//MyDemo 객체 1개생성 => 기본생성자
		//x,y값 출력하기
		MyDemo md1=new MyDemo();
		System.out.println("md1.x:"+md1.x);
		System.out.println("md1.y:"+md1.y);
		
		//MyDemo 객체 1개생성 => 인자 생성자
		
		MyDemo md2=new MyDemo(55,45.68);
		System.out.println("md2.x:"+md2.x);
		System.out.println("md2.y:"+md2.y);
		
	}

}
