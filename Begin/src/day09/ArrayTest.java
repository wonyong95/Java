package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*ArrayList
 *  - java.util.List계열
 *  - Vector와 기능은 동일
 *  - Vector는 메서드들이 동기화가 구현되어 있는 반면,
 *    ArrayList는 동기화되어 있지 않음 => 가볍다 =>웹에서 주로 사용
 * 
 * */
public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		System.out.println(arrList.size());
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		System.out.println(arrList.size()+"개 저장함");
		
		String str=arrList.get(0);//elementAt(int i)
		System.out.println(str);
		//iterator()메서드 이용해서 한꺼번에 출력
	    Iterator<String> it=arrList.iterator();
	    
	    while(it.hasNext()) {
	    	String s=it.next();
	    	System.out.println(s.toLowerCase());
	    }
		//sort
	    Collections.sort(arrList);
	    System.out.println("--sort이후---");
	    for(String s:arrList) {
	    	System.out.println(s);
	    }
	    //List<T> Arrays.asList(T ...)
	    
	   List<Person>arrList2= Arrays.asList(new Person("흑구",5), 
			   new Person("홍보속",30),
	    		new Person("짐명",22));
		
	    System.out.println("arrList2.size():"+arrList2.size());
	    
	    for(Iterator<Person> it2=arrList2.iterator(); it2.hasNext();) {
	    	Person p=it2.next();
	    	System.out.println(p.getName()+"@"+p.getAge());
	    }
	}

}
