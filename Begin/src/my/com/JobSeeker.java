package my.com;
import java.util.*;
//구직자 클래스
public class JobSeeker {
	
	String name;
	int age;
	int salary;
	String field;
	Scanner sc=new Scanner(System.in);
	
	public void input() {
		
		System.out.println("이 름 : ");
		name=sc.nextLine();
		
		System.out.println("나 이 : ");
		age=sc.nextInt();
		sc.skip("\r\n");
		System.out.println("희망 분야: ");
		field=sc.nextLine();
		
	    System.out.println("희망 급여: ");
	    salary=sc.nextInt();
	}
	
	public String introduce() {
		String intro="-----"+name+"---자기 소개----\n";
		intro+="이  름: "+name+"\n";
		intro+="나  이: "+age+"\n";
		intro+="지원 분야: "+field+"\n";
		intro+="희망 급여: "+salary+"\n";
		return intro;
	}
	
	public String projects(String[] arr) {
		String str=name+"참여한 프로젝트 목록...\n";
		if(arr.length==0) {
			return "없음";
		}
		for(int i=0;i<arr.length;i++) {
			str+=arr[i]+"\n";
		}
		return str;
	}

}


