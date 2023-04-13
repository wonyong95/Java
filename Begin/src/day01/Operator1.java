package day01;

public class Operator1 {
	public static void print(String str) {
   	 System.out.println(str);
	}
	
	public static void main(String[] args) {
		print("1. 단항연산자 (부호연산자, 증감연산자, 비트별 not 연산자(~), 논리부정연산자(!)");
        //+,-
		byte a=5;
		byte b=-7;
		print("+a:"+(+a));
		print("-b:"+(-b));
		print("증감연산자(++,--)------");
		int c=8;
		long d=6;
		c++;
		d--;
		print("c: "+c);
		print("d: "+d);
		++c;
		--d;
		print("c: "+c);
		print("d: "+d);
		
		float e=5.6f;
		double f=8.4;
		print("e: "+ ++e);
		print("f: "+ --f);
		
		print("e: "+ e++);
		print("f: "+ f--);
		print("--------");
		print("e: "+e);
		print("f: "+f);
		
		print("비트별 not 연산자(~)-------");
		int m=42;
		print("m: "+m);
		print("~m: "+(~m));
        /*   42를 비트로 바꾸어 연산해야함
         *  ~ : 0은 1로, 1은 0으로 비트반전을한다
         *  
         *  42
         *  21 .....0
         *  10 .....1
         *  5   ....0
         *  2   ....1
         *  1   ....0
         *  
         *   42: 00000000 00000000 00000000 00101010
         *   ~42: 11111111 11111111 11111111 11010101
         *   ==> 이값을 10진수로 바꿔서 사용
         * */		
		int x=0xfffffff1;
		print("x: "+x);
		print("~x"+ (~x));

	}

}
