package day07;
class A{
	
      public String toString() {
    	  return "4";
      }
	
}//////
class B extends A{
	@Override
	public String toString() {
		return super.toString()+"3";
	}
	
}//////
public class ObjectTest {
	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println("----------");	
		
		Object obj=new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(new B());
		
		Object obj2=new Object();
		Object obj3=obj2;
		
		System.out.println("obj==obj2:"+(obj==obj2));//주소값 비교
		System.out.println("obj2==obj3:"+(obj2==obj3));//주소값 비교
		
		System.out.println("obj.equals(obj2): "+ obj.equals(obj2));//주소값비교
		System.out.println("obj2.equals(obj2): "+ obj2.equals(obj3));
		
		String s1=new String("Hi");
		String s2=new String("Hi");
		//String의 equals()는 문자열 내용 비교로 오버라이딩 되어있다
		
		System.out.println("s1==s2: "+(s1==s2));//주소값비교
		System.out.println("s1.equals(s2): "+(s1.equals(s2)));//문자열내용비교
		
		String s3="Hi";//literal 방식으로 값을 할당할경우 객체는 literal pool에올라간다
		String s4="Hi";//이때 "Hi"문자열이 리터럴풀에 있는지 찾는다. 있으면 해당객체를 같이참조
		                //없다면 새로운 객체를 생성함
		String s5="hi";
		System.out.println("s3==s4: "+(s3==s4));
		System.out.println("s3.equals(s4): "+s3.equals(s4));//문자열 내용비교
		
		System.out.println("s3==s5: "+(s3==s5));
		
		
		
		
		
		
		
		
		
		
	}

}
