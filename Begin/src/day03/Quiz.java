package day03;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
    	System.out.println("정수를 입력하세요");
    	Scanner  sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	
    	
		//입력받은 값을 뒤집어서 출력하세요
    			//그리고 각각의 숫자값들의 합계를 구해 출력하세요
    	//123456789
//    	int sum=0;
//    	while(num>0) {
//    		int n=num%10;
//    				System.out.print(n+" ");
//    				num/=10; //num=num/10
//    				sum+=n;
////    	}
//    	System.out.println("\nsum: "+sum);
   	    System.out.println("***********");
        String numStr=String.valueOf(num);
        System.out.println(numStr);
        System.out.println("numStr.lenght()"+numStr.length());
        int sum=0;
        for(int i=numStr.length()-1;i>=0;i--) {
        	char ch=numStr.charAt(i);
//        	System.out.printf("%c ",ch);
        	int c=ch-'0';
        	System.out.printf(c+" ");
        	sum+=ch;
        }
        System.out.println("\nsum: "+sum);
	}
}
