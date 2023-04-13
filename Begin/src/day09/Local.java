package day09;

public class Local {
	String str="@@@";//멤버변수
	
	void sub(final String args){
		String lstr="###";//지역변수
		//로컬변수=> 로컬이너클래스에서 사용하려면 finla 변수여야한다. 값을수정할수없게끔
		
		System.out.println("str: "+str);
		System.out.println("lstr: "+lstr);
		class LocalInner{//Local Inner class- [1] 이름있는 로컬 이너클래스
			int no=90;
			void bar() {
				System.out.println("---LocalInner's bar()----");
				System.out.println("no: "+no);
				System.out.println("str= "+str);
				System.out.println("lstr= "+lstr);
				//lstr="값을 변경할게요";
				System.out.println("args: "+args);
				
			}
		}/////
		
		LocalInner li=new LocalInner();
		li.bar();
		
	}//sub()----------
	
	void demo() {
		class  LocalInner{
		//LocalInner 클래스는 소속된 메서드 내에서만 객체 생성가능함
			//class를 구성한후에 객체생성가능함
			
		}
	}////
    public static void main(String[] args) {
		Local lc=new Local();
		lc.sub("Hello");
		
		
	}
	
	
}//Local class///////
