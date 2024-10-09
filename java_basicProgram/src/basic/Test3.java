package basic;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner  sc= new Scanner(System.in);
		

		  System.out.println("please enter the value of n");
		  int num= sc.nextInt();
		  
		  if(num>999) {
			  
			         if(num%2==0) {
			        	 
			        	    System.out.println("The number is even");
			         }
			         else {
			        	 
			        	    System.out.println("the number is odd");
			         }
		  
		  }
	
		  else {
			  
			     System.err.println("the number is less than 999");
		  }
		  }
	}


