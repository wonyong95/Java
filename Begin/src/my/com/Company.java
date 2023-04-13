package my.com;

public class Company {
	
	String name;// 회사명 디폴트값 nu
	int year;// 설립년도 0
	int employees; //사원수 0
	
	//디폴트 생성자를 기본적으로 제공한다
	//멤버 변수의 딜포트값들을 초기화한다
		
	//생성자 구성(Constructor)
	public Company() {
		//인스턴스 변수들의 초기화
		name="일반회사";
		year=1900;
		employees=2;
		
	}
	
	public void info() {
		System.out.println("회사명: "+name);
		System.out.println("설립년도: "+year+" 년");
		System.out.println("총사원수: "+employees+" 명");
		
	}

}
