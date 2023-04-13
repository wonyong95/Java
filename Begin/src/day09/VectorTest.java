package day09;
import java.util.*;
/* Java Collection : -List계열: 
 *-List계열:  Vector, ArrayList  (web)
 *-Map 계열: Hashtable, HashMap (web)
 *-set 계열: HashSet, TreeSet
 *
 * 객체를 수집해서 저장, 검색 ,삭제 ,수정할수 있는 역할을 수행함
 * 
 *  Vector
 *  - 객체 유형의 데이터 저장 가능
 *  - 다른 종류의 데이터도 저장가능
 *  - 동적으로 저장 크기를 늘릴 수있다
 *  -java.util.List 인터페이스를 구현함
 *  -유사한 클래스: ArrayList
 *  
 *  List계열의 특징
 *  -입력순서를 기억한다
 *  -데이터 중복 저장을 허용함
 * */

public class VectorTest {
	public static void main(String[] args) {
		//jdk1.4버전일떄
		Vector v=new Vector(5,3);
		System.out.println("v의 현재 용량1: "+v.capacity());
		System.out.println("v의 현재 크기: "+v.size());
		
		//초기용량:5 , 증가치:3
		//데이터가 차면 저장 영역을 3만큼 늘린다
		//boolean add(Object o), boolean addElement(Object o)
		v.add("Hello");
		v.add(new String("Hi"));
		v.add(10);//Integer 객체로 auto boxing되어 저장된다
		v.add(Integer.valueOf(20));
		System.out.println("v의 현재 용량2: "+v.capacity());
		System.out.println("v의 현재 크기2: "+v.size());
		//4개 1~4 반복문이용해저장
		for(int i=1;i<6;i++) {
			v.add(i);
		}
		System.out.println("v의 현재 용량3: "+v.capacity());
		System.out.println("v의 현재 크기3: "+v.size());
		
		//데이터 꺼내기
		//public Object get(int index)
		//public Object elementAt(int index)
		String obj=(String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Integer obj2=(Integer)v.get(3);
		System.out.println(obj2);
		//jdk5.0이후부터 Generic을 이용함
		Vector<String> v2=new Vector<String>();
		//String유형만 저장하는 벡터를 생성함
		v2.add("Orange");
		v2.add("Apple");
		v2.add("Mango");
		
		//v2.add(10);[x]
		String str=v2.get(0);//형변환 필요없다
		System.out.println(str.toLowerCase());
		
		//v2에 저장된 값을 for 루프 이용해서 출력하기
		for(int i=0;i<v2.size();i++) {
			String s=v2.elementAt(i);
			System.out.println(s);
		}
		
		//확장 for 루프 이용해 출력
		for(String s:v2)
			System.out.println(s.toUpperCase());
		
		//[문제1] Float유형을 저장할 벡터 v3를 생성하고
				// Float객체 3개 저장하세요.
				// 확장 for루프를 이용해 v3에 저장된 값들의 합계를 구하세요
		Vector<Float> v3=new Vector<Float>();
		
		v3.add(1.11f);//auto boxing
		v3.add(2.22f);
		v3.add(3.33f);
		
		float sum=0;
		for(Float val:v3) {
			sum+=val;//Float ==> float: auto unboxing
		}
		System.out.println("sum: ");
		

	}

}
