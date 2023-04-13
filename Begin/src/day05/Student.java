package day05;

public class Student {
	private int no;
	private String name;
	private String className;
	
	public void setNo(int no) {
		//지역변수와 멤버변수의 이름이 같을 경우에는 지역변수가 우선이다.
		//이것이
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setClassName(String className) {
		this.className=className;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getClassName() {
		return className;
	}
	
	public void showInfo() {
		System.out.println("---학생 정보-----");
		System.out.printf("학 번: %d%n", getNo());
		System.out.printf("이 름: %s%n", getName());
		System.out.printf("학급명:  %s%n", getClassName());
		
		
	}
	

}
