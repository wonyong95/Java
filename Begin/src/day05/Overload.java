package day05;

public class Overload {
	public static void main(String[] args) {
		//슈퍼맨 객체 생성후 showInfo() 로 출력
		Superman s1=new Superman();
		String str=s1.showInfo();
		System.out.println(str);
		
		Superman s2=new Superman("최슈퍼");
		System.out.println(s2.showInfo());
		
		Superman s3=new Superman("정슈퍼",177);
		System.out.println(s3.showInfo());
		
//		
	    Aquaman a1=new Aquaman("고등어", 150,78.12);
	    System.out.println(a1.showInfo());
	    
	    Aquaman a2=new Aquaman("갈치", 170);
	    System.out.println(a2.showInfo());
	    
	    Superman[] arrSup= {s1,s2,s3};
	    for(int i=0;i<arrSup.length;i++) {
	        String info=arrSup[i].showInfo();
	        System.out.println(info);
	    }
	    //슈퍼맨 아쿠아맨 모두 저장할배열
	    Object[] arrObj= {a1,a2,s1,s2,s3};
	    Aquaman am=(Aquaman)arrObj[0];
	    //자식-작은자료형 =(자식유형)Objject유형(부모-큰자료형)
	    System.out.println(am.showInfo());
	    //instanceof 연산자
	    //참조변수 instanceof 클래스명 : 변수가 클래스의 객체면 true를 반환
	    //그렇지않으면 false를 반환한다
	    
	    for(int i=0;i<arrObj.length;i++) {
	    	if(arrObj[i] instanceof Aquaman) {
	    		Aquaman aman=(Aquaman)arrObj[i];
	    		System.out.println(aman.showInfo());
	    	}else{
	    		//슈퍼맨객체
	    		Superman sman=(Superman)arrObj[i];
	    		System.out.println(sman.showInfo());
	    	}
	    }
	     
	    
	    
	    
	}

}
