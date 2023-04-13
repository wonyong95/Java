package day02;

public class ForTest00 {
	
	public static void main(String[] args) {
		   System.out.println("[1]");
          for(int a=0;a<4;a++) {
        	  for(int b=0;b<5;b++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
          System.out.println("[2]");
          for(int a=0;a<5;a++) {
        	  for(int b=0;b<a;b++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
          System.out.println("[3]");
          for(int a=0;a<5;a++) {
        	  for(int b=0;b<4;b++) {
        		  if(a + b > 3) 
        		  System.out.print("*");
        	  else 
        		  System.out.print(" "); }
        	  System.out.println();
          }
          for(int a=0;a<4;a++) {
        	  for(int b=0;b<4;b++) {
        		  System.out.printf("(%d,%d)",a,b);
        	  }
        	  System.out.println();
          }
          System.out.println("[4]");
          for(int a=0;a<3;a++) {
	    	  for(int b=0;b<5-a;b++) {
	    		  System.out.print(" ");
	    	  }
	    	  for (int c=0; c<2*a+1;c++) {
	    		  System.out.print("*");
	    		  
	    	  }
	    	  System.out.println();
	      }
          
          System.out.println("[4]-2");
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 5; j++) {
	            System.out.print((j > i + 2 || j + i < 2)? ' ': '*');
	         }
	         System.out.println();
	      }
	      System.out.println();
	      // i = 0 => 0 1 3 4 j = 2
	      // i = 1 -> 0 4 j= 1 2 3
	      // i = 2 -> j = 0 1 2 3 4
          
          System.out.println("[5]");
          
          for (int i = 0; i < 7; i++) {
             for (int j = 0; j < 5; j++) {
                System.out.print((i <= 3 && i >= j)? '*':(i > 3 && i + j <= 6)? "*":' ' );            
             }
             System.out.println();
          }
       }
    
          
          

	

	//중첩 for루프 이용해서 아래와 같이 출력하세요
			/*[1]
			 *   *****
			 *   *****
			 *   *****
			 *   *****
			 *   
			 *   4행5열
			 * 
			 * */
			
			/* [2]
			 * 
			 *  *
			 *  **
			 *  ***
			 *  ****
			 * 
			 * */
			
			/*[3]
			 * 
			 *    *
			 *   **
			 *  ***
			 * ****     
			 * 
			 * (0,0)(0,1)(0,2)(0,3)
			 * (1,0)(1,1)(1,2)(1,3)
			 * (2,0)(2,1)(2,2)(2,3)
			 * (3,0)(3,1)(3,2)(3,3)
			 * */
			
			
			/* [4]
			 *    *
			 *   ***
			 *  *****  
			 * 
			 * (0,0)(0,1)(0,2)(0,3)(0,4)
			 * (1,0)(1,1)(1,2)(1,3)(1,4)
			 * (2,0)(2,1)(2,2)(2,3)(2,4)
			 * */
			
			/* [5]
			 * 
			 *  *
			 *  **
			 *  ***
			 *  ****
			 *  ***
			 *  **
			 *  *
			 *  
			 *  
			 * */

}
