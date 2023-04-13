package day03;

import javax.management.loading.PrivateClassLoader;

import day01.primitive3;

public class ArrayTest2 {
	public static void main(String[] args) {
		int x[]= {1,2,3,4};
		int [] y;
		
		y=x;
		//x가 참조하는 배열을 y도 같이참조하는 형태가된다
		//확장 for루프로 y에 저장된 값을 추력하기
		for(int a:y) {
			System.out.println(a);
		}
		y[2]=300;
		System.out.println("y[2]="+y[2]);
		System.out.println("x[2]="+x[2]);
		System.out.println("----------------");
		
		int []m= {10,20};
		int n[]= {3,4,5,6};
		int tmp[];
		//[1] m과 n의 배열을 서로 바꿔서 참조해보세요
		tmp=m;
		m=n;
		n=tmp;//swap
		
		for(int i=0;i<m.length;i++){
			
			System.out.printf("m[%d]=%d%n", i,m[i]);
		}
		for(int i=0;i<n.length;i++){
			System.out.printf("n[%d]=%d%n", i,n[i]);
		}
		
		
		
	}

}
