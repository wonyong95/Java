package day02;

import java.util.Arrays;
import java.util.jar.Pack200;

public class Test {
	public static void main(String[] args) {
	      for(int i=0;i<3;i++) {
	    	  for(int j=0;j<5-i;j++) {
	    		  System.out.print(" ");
	    	  }
	    	  for (int k=0; k<2*i+1;k++) {
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
    
	
	}
}
