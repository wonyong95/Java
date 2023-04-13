package day04;

public class Job {
	int age;
	int career;
	String gender;
	String name;
	
	public String introduce() {
		String intro="---자기소개 ---\n";
	    intro+="이 름: "+name+"\n";
	    intro+="나 이: "+age+"\n";
	    intro+="성 별:  "+gender+"\n";
	    intro+="경 력: "+career+"\n";
	    return intro;
	}
	public String projects(String []arr) {
		String str="참여한 프로젝트 목록..\n";
		if(arr.length==0) {
			return "없음";
		}
		for(int i=0;i<arr.length;i++) {
			str+=arr[i];
		}
		return str;
		
	}
	
	
	}


