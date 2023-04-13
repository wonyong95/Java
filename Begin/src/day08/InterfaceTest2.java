package day08;

import org.w3c.dom.views.AbstractView;

//인터페이스가 인터페이스를 상속받을때는 extends로 받으며, 여러개 상속 가능하다
interface Inter1{
	void a();//public abstract가 붙는다
	int b();
}//////////
interface Inter2{
	double PI=3.14;// public static final이 붙는다
}//////////
//인터페이스가 인터페이스를 상속받을때는 extends로 받으며, 여러개 상속 가능하다
interface Inter3 extends Inter1, Inter2 
{
	void c();
}////////////
abstract class Absclass //추상 클래스
{
      abstract void d();//생략형 접근지정자(public 안붙이면)
}//////////////////////
//[1]MyDemo 클래스가 AbsClass ,Inter3을 상속받은뒤 에러 없도록 조치
class MyDemo extends Absclass implements Inter3 
{
	@Override
	public void a() {
		System.out.println("a()###");
	}
	public int b() {
		return 0;
	}
	public void c() {}
   void  d() {
	   System.out.println("d()@@@ ");
	  
  }
}//////////////////////

public class InterfaceTest2 {
	public static void main(String[] args) {
		// [2] MyDemo객체 생성해서 a(),b(),c(),d()호출하고 PI값 출력하기
		MyDemo my=new MyDemo();
		my.a();
		System.out.println(my.b());
		my.c();
		my.d();
		System.out.println("MyDemo.PI="+MyDemo.PI);
		System.out.println("Inter2.PI="+Inter2.PI);
		
		Inter1 im=new MyDemo();
		Inter2 im2=new MyDemo();
		Inter3 im3=new MyDemo();
		Absclass ac=new MyDemo();
		
		im.a();
		System.out.println(im.b());
//		im.c();//[x]
        im3.c();
        im3.a();
        im3.b();
        
//        im2.a();[x]
        ac.d();
//        ac.a();[x]
        ((MyDemo)ac).a();
        ((Inter1)ac).a();
        
}
}
