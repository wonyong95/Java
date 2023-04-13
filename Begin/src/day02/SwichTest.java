package day02;



import javax.swing.JOptionPane;


public class SwichTest {
	
	/*
	 * switch(변수|수식){
	 *   case 값1: 실행문; break;
	 *   case 값2: 실행문; break;
	 *   ...
	 *   default: 실행문;
	 * }
	 * 이 때 변수 또는 수식은 int형 이하의 자료형 이거나 String유형만 가능하다.
	 * */
     public static void main(String[] args) {
//    	 long a=1; [x]
//    	 short a=1; //int형 이하의 자료형만사용가능
//    	 String a="1";
//    	 switch(a) {
//    	 case "1":
//    		 System.out.println("one"); break;
//    	 }
    	 
    	 boolean i = true;
         while (i) {
            
            String month = JOptionPane.showInputDialog("1~12월 사이의 값을 입력하세요");
            if (month == null)
               continue;
            switch (month) {
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "10":
            case "12":
               System.out.printf("%s월은 31일까지 있습니다",month);
               i =false;
               break;
            case "2":
               System.out.printf("%s월은 28일 or 29일까지 있습니다",month);
               i =false;
               break;
            case "4":
            case "6":
            case "9":
            case "11":
               System.out.printf("%s월은 30일까지 있습니다",month);
               i =false;
               break;
            default:
               System.out.println("1~12월 사이의 값을 입력하세요");
               break;
            }
         }
 
     }
}

