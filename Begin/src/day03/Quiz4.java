package day03;
import java.util.Scanner;

public class Quiz4 {
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
		Scanner scanner = new Scanner(System.in);
		 showMenu();
		int num= scanner.nextInt();
		if(num==9) {
			System.out.println(" 종 료 ");
			return;
		} 
		
		
		int water=0;
		int rate=0;
		int tax=0;
		int totalrate=0;
		
		switch (num) {
		case 1:	System.out.println("사용한 liter를 입력하시오");
		      water= scanner.nextInt();
		      rate = water * 50;
		      break;
		      
		case 2:	System.out.println("사용한 liter를 입력하시오");
		     water= scanner.nextInt();
	          rate = water * 45;
	          break;
									
		case 3:	System.out.println("사용한 liter를 입력하시오");
		      water= scanner.nextInt();
	          rate = water * 45;
			  break;
		
			  
		default:
			System.out.println("메뉴 번호를 입력하세요");
			return;
		
		}
		tax= (int)(rate*0.05);
		totalrate=rate+tax;
		System.out.println("수도요금: "+rate+" 원");
		System.out.println("세 금: "+tax+" 원");
		System.out.println("총수도요금: "+totalrate+" 원");
		
		
	
	// 무한반복 돌면서 수도요금을 계산하는 프로그램을 구성하세요
			// switch ~case문 활용해서 수도요금 계산하기
			// output
			// 1. 선택한 메뉴번호
			// 2. 사용한 수도량
			// 3. 수도요금
			// 4. 세   금 (수도요금의 5%)
			// 5. 총수도요금(수도요금+세금)
		
		
	}
}
