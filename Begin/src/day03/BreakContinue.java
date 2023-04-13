package day03;
/* 보조제어문: break, continue
 *  break;가까운반복문을 벗어난다
 *  continue;가까운 반복문을 계속수행한다
 * 	break 레이블명; 레이블명과 가까운 반복문을 벗어난다
 *  continue 레이블명; 레이블명과 가까운 반복물은 계속 수행
 * */

public class BreakContinue {
	public static void main(String[] args) {
		System.out.println("1----------");
		for(int i=0;i<3;i++) {
	        if(i==1)break;
	        System.out.println("i:"+i);//i:0
		}
		System.out.println("2----------");
		for(int i=0;i<3;i++) {
	        if(i==1)continue;
	        System.out.println("i:"+i);
		}
		System.out.println("3----------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
	        if(k==1)break;
	        System.out.println("i: " +i+ ",  k:" +k);
		}
		}
		System.out.println("4----------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
	        if(i==1)continue;
	        System.out.println("i: "+i+",  k:" +k);
			}
		}
		System.out.println("5----------");
		outer: //label지정 => 반복문앞에붙일수있다
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0;k<3;k++) {
	        if(k==1)break outer;
	        System.out.println("i: "+i+",  k:" +k);
			}
		}
		
			System.out.println("6----------");
			outer: //label지정 => 반복문앞에붙일수있다
			for(int i=0;i<3;i++) {
				inner:
				for(int k=0;k<3;k++) {
		        if(i==1)continue outer;//지정된 label과 가까운 반복문을 계속수행한다
		        System.out.println("i: "+i+",  k:" +k);
				}
			}
		
	}

}
