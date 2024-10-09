package demoClass;

import java.util.*;

// method overloading
public class Calculator {
   
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
	System.out.println(	"plesse enter the number");
		  int age=sc.nextInt();
		  
		  if(age>=18) {
			  
			  System.out.println("you are eligible for vote");
			  
		  }
		  
		  else if(age==18){
			  
			    System.out.println("not eligible for voting")  ;
		  }
		  
		  else if(age>5) {
			  
			  
			  System.out.println("welcome on earth");
		  }
			
		  else {
			  
			  System.out.println(" you have entered invalid data");
		  }
		
	}
}
		
		
	