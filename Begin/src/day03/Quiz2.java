package day03;
import java.util.Scanner;
public class Quiz2 {
	
	    
	private static int i;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요=>");
		String str=sc.nextLine();
		System.out.println("str:"+str);
			
		//입력한 값이 숫자가 맞는지 여부를 체크해서
		//숫자가아니면 "숫자가 아니에요 다시입력하세요";
		//숫자가 맞다면 해당 숫자 2진수값을 출력하세요
		for(int i=0;i<str.length();i++);{
		
		boolean b= Character.isDigit(str.charAt(i));
		if(!b) {
			System.out.println("숫자가 아니에요 다시입력하세요");
			//return;
			str=sc.nextLine();
			i=0; 
		}
		}
		int num=Integer.parseInt(str);
		System.out.println(str+"의 2진수: "+Integer.toBinaryString(num));
		System.out.printf("%s의 8진수: %s%n",str,Integer.toOctalString(num));
		System.out.printf("%s의 16진수: %s%n",str,Integer.toHexString(num));
	}

}
