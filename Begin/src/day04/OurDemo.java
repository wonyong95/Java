package day04;

public class OurDemo {
	
	int a=1;//인스턴스 변수
	int b;
	static int c=3;//클래스변수
	static int d;
	
	static { 
		//static  initializer : main()메서드 보다도 먼저
		//메모리에 올라간다 static변수 초기화는 여기서 한다
		d=4;
		System.out.println("static block");
	}
	
	
	public OurDemo() {
		b=2;
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("main()---------");
		System.out.println(OurDemo.d);
	}

}
