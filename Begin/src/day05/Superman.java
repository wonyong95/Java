package day05;

public class Superman {
	String name;
	int height;
	int power;
	//생성자 오버로딩
	public Superman() { //기본생성자(default constructor)
		this("아무개",160,100);//자기자신의 생성자를 호출한다
//		name="아무개";
//		height=190;
//		power=140;
		/*this()는 생성자 안에서만 호출 가능하며
		 * 첫번째 줄에 위치해야한다
		 * super()와는 함께사용할수없다
		 * */
		
		
	}
	public Superman(String name) {
		this(name,190,200);
//		this.name=name;
//		height=165;
//		power=200;
	}
	public Superman(String n, int h) {
		this(n,h,300);
//		name=n;
//		height=h;
//		power=300;
	}
	public Superman(String n, int h, int p) {//최종목적지 =여기서 초기화를 할예정
		name=n;
		height=h;
		power=p;
	}
	
	public String showInfo() {
		String str="---슈퍼맨 정보---\n";
		str+="이 름: "+name+"\n키 : "+height+"\n초능력: "+power;
		return str;
		
	}

}
