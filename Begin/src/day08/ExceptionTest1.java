package day08;

public class ExceptionTest1 {
	public static void main(String[] args) {
	     String[] fruits= {"Apple", "Grape","Orange"};
	     //[1] Handle하는 방법 : try~catch
	     //[2] Declare하는 방법 : throws
	     try {
	     for(int i=0;i<4;i++) {
	    	 System.out.println(fruits[i]);
	     }//for---
	     }catch(ArrayIndexOutOfBoundsException e) {
	    	 System.out.println("배열 인덱스가 초과되었어요 확인바람");
	     }
	     
	     System.out.println("#반드시 실행되어야하는 중요한코드");
	}

}
