package my.com;
import java.awt.Menu;
//기본적인 application의기능 : CRUD
/*  Create : 데이터등록
 *  Read: 데이터 조회
 *  UPdate : 데이터 수정
 *  Delete: 데이터 삭제
 * */
import java.util.*;

import day04.JobKoreaApp;
public class JobkoearApp {
	Scanner sc=new Scanner(System.in);
	JobSeeker[]arr=new JobSeeker[3];
	int count=0;
	
	
	
	public void menu() {
		System.out.println("----JobkoreaApp v1.1----");
		System.out.println(" 1. 구직자 등록");
		System.out.println(" 2. 회사 등록");
		System.out.println(" 3. 구직자 정보 출력");
		System.out.println(" 4. 회 사 정보 출력");
		System.out.println(" 9. 종      료   ");
		System.out.println("------------------------");
		System.out.println(" 메뉴 번호를 선택하세요 =>");
		System.out.println("------------------------");
	}
	/* 구직자 정보를 입력받아 배열에 저장하는 메서드*/
	public void registerJobSeeker() {
		if(count>=arr.length) {
			System.out.println("등록 마감! [현재 등록인원"+count+"명]");
			return;
		}
		//jobSeeker 객체 생성
		JobSeeker jsk1=new JobSeeker();
		//input()호출
		jsk1.input();
		String info=jsk1.introduce();
		System.out.println(info);
		System.out.println(">>위 정보를 등록할까요? [1. yes 2.no]");
		//arr에 저장하기
		int no =sc.nextInt();
		if(no==1) {
			arr[count++]=jsk1;
			System.out.println("등록 완료! 현재 등록 인원: "+count+"명");
				
		}else {
			System.out.println("등록을 취소 하였습니다!");
		}
		
	}
	/** 등록된 모든 구직자 정보를 배열에서 꺼내서 출력하는 메서드*/
	public void printJobseeker() {
		for (int i=0;i<count;i++) {
		JobSeeker person=arr[i];
		if(person!=null) {
		String info=person.introduce();
		System.out.println(info);
		    }
          }
		}

     public static void main(String[] args) {
			//반복문 돌면서 menu 보여주고 입력받기
    	 JobkoearApp app=new JobkoearApp();
    	 while(true) {
    		 app.menu();
    		 int num=app.sc.nextInt();
    		 if(num==9) {
    			 System.out.println("Bye Bye~~");
    			 break;
    		 }
    		 if(num<1||num>4) {
    			 System.out.println("메뉴에 없는 번호에요. 다시 입력하세요");
    			 continue;
    		 }
    		 switch (num) {
			case 1:	
				app.registerJobSeeker();
				break;
			case 2:				
				break;
			case 3://등록한 모든 구직자 정보
				app.printJobseeker();
				break;
			case 4:				
				break;
			
			}
    	 }
	}
}
