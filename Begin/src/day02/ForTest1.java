package day02;

public class ForTest1 {
	public static void main(String[]args) {
		/*
		 * for (변수 선언및초기화;조건식;증감식){
		 *     실행문;
		 *     }
		 * */
		for(int i=1;i<4;i++) {
			System.out.println("Hello"+i);
		}
			int j=5;
			for(;j>0;j-=2) {
				System.out.println("java"+j);
			}
			//j의 scope는? main()메서드 블럭이 끝날때 까지 살아있음
			
						
			//[1] 1~100까지 정수를 다음과 같은 식으로 계산한 수식과 결과값을 출력하세요.
			// 1 + (-2) + 3+(-4)+5 +(-6) ....+(-100) = 결과값
			int sum=0;
			int d=1;
			
			for(int i=1;i<101;i++,d=-d) {
				sum+=i*d;
				if(i<100) {
					System.out.println(i*d+"+ ");
				}else {
					System.out.println(i*d+"=");
				}
			}
			System.out.println(sum);
			//[2] 알파벳 대문자A,B...Z 를 for루프 이용해 출력하기
			for(int k='A'; k<='Z';k++) {
				System.out.printf("%c",k);
			}
			System.out.println();
			for(char k='A';k<='Z';k++)
				System.out.println(k+" ");
			
			//[3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
			//의 총 합계값을 출력하세요
			sum=0;
			int total=0;
			for(int i=1;i<11;i++) {
				sum+=i;
				total+=sum;
			}
			System.out.println("sum:"+sum);
			System.out.println("total:"+total);
		
		}
	}


