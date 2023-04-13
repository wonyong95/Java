package day04;

import java.util.Iterator;

public class ArrayTest1 {
	      public static void main(String[] args) {
			//2차원 배열
	    	  //1)선언
//	    	  int [][]a;
//	    	  int []a[];
	    	  int a[][];
	    	  //2) 메모리할당
	    	  a=new int[3][2];//3행2열
	    	  System.out.println(a[0][0]);
	    	  
	    	  //3)초기화
	    	  a[0][0]=10;
	    	  a[0][1]=20;
	    	  
	    	  a[1][0]=30;
	    	  a[1][1]=40;
	    	  
	    	  a[2][0]=50;
	    	  a[2][1]=60;
	    	  //행의 크기: a.lenght
	    	  //열의 크기: a[i].lenght
	    	  System.out.println("a.lenght: "+a.length);
	    	  System.out.println("a[0].lenght: "+a[0].length);
	    	  System.out.println("a[1].lenght: "+a[1].length);
	    	  System.out.println("a[2].lenght: "+a[2].length);
	    	  
	    	  for(int i=0;i<a.length;i++) {
	    		  for(int j=0;j<a[i].length;j++) {
	    			  System.out.print(a[i][j]+" ");
	    		  }
	    		   System.out.println();
	    	  }
	    	  System.out.println("-=============-");
	    	  //한꺼번에 하는방법
	    	  short[]b[]= {{100,200},{-5,-8,1},{20}};
	    	  
	    	  //for루프 출력
	    	  for(int i=0;i<b.length;i++){
	    		  for(int j=0;j<b[i].length;j++) {
	    			  System.out.printf("b[%d][%d]=%d",i,j,b[i][j]);
	    		  }
	    		  System.out.println();
	    	  }
	    	  System.out.println("-=============-");
	    	  //확장 for루프  출력
	    	  for(short[] sb:b) {
//	    		  System.out.println(sb+" \t");
	    		  for(short s:sb) {
	    			  System.out.print(s+" \t");
	    		  }
	    		  System.out.println();
	    	  }
	    	  System.out.println("-=============-");
	    	  //행의 크기만 먼저잡고,나중에 열의크기할당하는 방법
	    	  char[][] ch=new char[3][];//3행
	    	  
	    	  ch[0]=new char[2];//2열
	    	  ch[1]=new char[4];//4열
	    	  ch[2]=new char[3];//3열
	    	  
	    	  ch[0][0]='H';
	    	  ch[0][1]='i';
	    	  
	    	  ch[1][0]='J';
	    	  ch[1][1]='a';
	    	  ch[1][2]='v';
	    	  ch[1][3]='a';
	    	  
	    	  //char의 default값 '\u0000'
	    	  
	    	  for(char[] cb:ch) {
	    		  for(char c:cb) {
	    			  System.out.print(c);
	    		  }
	    		  System.out.println();
	    	  }
	    	  System.out.println("-=============-");
		}
	      

}
