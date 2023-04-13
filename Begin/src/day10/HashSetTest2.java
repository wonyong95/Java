package day10;
import java.util.*;
public class HashSetTest2 {
	public static void main(String[] args) {
		// Person객체 3개 생성해서
				// HashSet에 저장한 뒤
				// 반복문 이용해서 사람 정보를 출력하세요(이름, 나이)
		Person p=new Person("배혀니",27);
		Person p1=new Person("박시현",39);
		Person p2=new Person("짱지용",28);
		
	    HashSet<Person> hs=new HashSet<>();
	    hs.add(p);
	    hs.add(p1);
	    hs.add(p2);
		for(Person ps:hs) {
			System.out.println(ps);
			System.out.println(ps.getName()+": "+ps.getAge());
		}
		System.out.println("**********************");
		Person p3=new Person("짱지용",28);
		hs.add(p3);
		System.out.println("hs.size(): "+hs.size());//4
		
		Person p4=p;//중복데이터로 간주한다(주소값이 같으므로)
		
		hs.add(p4);
		System.out.println("hs.size(): "+hs.size());
		
		for(Person ps:hs) {
			System.out.println(ps.getName()+"@ "+ps.getAge());
		}
	}

}
