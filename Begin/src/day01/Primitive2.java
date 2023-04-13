package day01;

public class Primitive2 {
	//main()메서드 구성하기
	public static void main(String[] args) {
		System.out.println("2.실수형------");
		//float < double
		//float: 단정밀도 , 소수점 이하 7자리 4byte
		//double: 배정밀도 ,소수점이하 15~16자리 [디폴트] 8byte
		float ft1=10.1234F;
		//float형일 경우 부동소수점일 경우 반드시 접미사 f,F를 붙인다. 그렇지않으면 double로인식
		float ft2=800;//promotion(자동형변환): 작은유형에서 큰유형으로 자동으로 형변환이일어남
	    
		System.out.printf("ft1=%f%n",ft1);
		System.out.printf("ft2=%f%n",ft2);
		
		float ft3=.789f;
		System.out.println("ft3="+ft3);
		
		double db1=123.456789;
		double db2=789.123456;
		System.out.println("db1="+db1);
		System.out.println("db2="+db2);
		
		//과학적 지수 표기방법: E
		double db3=3e-2;//3*10^-2
		double db4=3e-2;//3*10^2
		//sysout => ctrl+스페이스바
		System.out.println("db3="+db3);
		System.out.println("db4="+db4);
		
		//float타입 변수 선언하고 900E7값을 할당한후 출력하세요
		float ft4=9003e7f;
		System.out.println("ft4="+ft4);
	    //promotion : byte < short < int < long < float < double
		
		
				
	}
	}