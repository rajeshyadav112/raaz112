package classDemo;

import java.util.Scanner;

public class Test {
	
	    // write java program to check number is divisible by 7 and also ends with 7
	     public static void main(String[] args) {
		  
	    Scanner	sc=new Scanner(System.in);
	    
	         
	    System.out.println("please enter the value of n:");
	    
	    	 int n=sc.nextInt();
	    	 
	    	 if(n%7==0 && n%10==7) {
	    		 
	    		 System.out.println(" The number is divisible with 7 and also ends with 7");
	    		 
	    	 }
	    	 
	    	 else {
	    		 
	    		    System.out.println("The number is not divisible with 7 or ends with 7");
	    	 }
	    	 
	         
	 	  
	

}
}


