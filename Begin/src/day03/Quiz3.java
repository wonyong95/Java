package day03;

import java.security.PublicKey;
import java.util.*;

public class Quiz3 {
	public static void startGame() {
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100사이의 정수를 입력하세요");
		//컴퓨터가 랜덤한 정수값을 1<= r <=100 사이의 임의의 정수를 발생시킨다.
				//이 값을 맞추는 게임
				//단 게임시도횟수가 7번을 초과하면 "실패!!" 게임 종료
		int cnt=1;
		int com=(int)(Math.random()*100)+1;
		
		while(cnt!=7) {
			int user=sc.nextInt();
		if(com==user) {
			System.out.println("정답입니다.^^ 시도횟수:"+cnt);
			return;
		}else if (com>user) {
			System.out.println(user+"갑 보다 더 큰값입니다 시도횟수:"+cnt);
		}else if (com<user) {
			System.out.println(user+"값 보다 더작은 값입니다 시도횟수:"+cnt);
		}
		cnt++;
		}		
		System.out.println("Game over!! 시도횟수["+cnt+"] 초과");

}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100사이의 정수를 입력하세요");
		//컴퓨터가 랜덤한 정수값을 1<= r <=100 사이의 임의의 정수를 발생시킨다.
				//이 값을 맞추는 게임
				//단 게임시도횟수가 7번을 초과하면 "실패!!" 게임 종료
		int cnt=1;
		int com=(int)(Math.random()*100)+1;
		
		while(cnt!=7) {
			int user=sc.nextInt();
		if(com==user) {
			System.out.println("정답입니다.^^ 시도횟수:"+cnt);
			return;
		}else if (com>user) {
			System.out.println(user+"갑 보다 더 큰값입니다 시도횟수:"+cnt);
		}else if (com<user) {
			System.out.println(user+"값 보다 더작은 값입니다 시도횟수:"+cnt);
		}
		cnt++;
		}		
		System.out.println("Game over!! 시도횟수["+cnt+"] 초과");

}
}