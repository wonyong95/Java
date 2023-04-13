package day03;

import java.util.Scanner;

public class dddq {
	public static void showMenu() {
		String str="-------수도요금 계산기 v1.1-----------\n";
		       str+="1.가정용 (liter당 50원)\n";
		       str+="2.상업용 (liter당 45원)\n";
		       str+="3.공업용 (liter당 30원)\n";
		       str+="9. 종      료\n";
		       str+="-------------";
		       str+="메뉴 번호를 입력하세요";
		       str+="-------------";
		       System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;) {
			dddq.showMenu();
			int num=sc.nextInt();
			if(num==9) {
				System.out.println("Bye Bye~~");
//				break;
				System.exit(0);//시스템종료 . 0: 장상종료 음수값:에러발생시 종료
			}
			//유효성체크
			if(num<1||num>3) {
				System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요");
				continue;
			}
			System.out.println("수도 사용량 입력=>");
			int use=sc.nextInt();
			
			String str="";
			int price=1;
			switch (num) {
			case 1:
				price=50;
				str="가정용";
				break;
			case 2:
				price=45;
				str="상업용";
				break;
			case 3:
				price=30;
				str="공업용";
				break;
			
		}
			int fee=use*price;
			double tax=(int)(fee*0.05);
			str+="단가: "+price+"원";
			System.out.println("=============");
			System.out.println("메뉴번호: "+num+"("+str+")");
			System.out.println("사용량 "+use+"liter");
			System.out.println("수도요금: "+fee+"원");
			System.out.println("세금 :"+tax+"원");
			System.out.println("총수도세금: "+(fee+tax)+"원");
			System.out.println("============");
		
		}
		
		

}
}