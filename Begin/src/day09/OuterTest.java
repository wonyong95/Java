package day09;

public class OuterTest {
	
	public static void main(String[] args) {
		
		// 1.Outer 클래스의 변수 a,b출력
	     Outer o=new Outer();
	     System.out.println("o.a= "+o.a);
		System.out.println("Outer.b= "+Outer.b);
		
		// 2.Outer.Inner 클래스의 변수 c값출력 ,sub호출
		Outer.Inner oI=o.new Inner();
		System.out.println("oi.c= "+oI.c);
		oI.sub();
		
		Outer.Inner oi2=new Outer().new Inner();
		System.out.println("oi2.c= "+oi2.c);
		
		// 3.Outer.SInner클래스의 d,e,foo(),bar()호출
		System.out.println("Outer.SInner.e= "+Outer.SInner.e);
		Outer.SInner.bar();
		
		Outer.SInner os=new Outer.SInner();
		System.out.println("os.d= "+os.d);
		os.foo();
		
		o.test();
		
		
		
		
		
		
	}

}
