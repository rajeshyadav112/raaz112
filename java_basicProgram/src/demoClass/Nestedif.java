package demoClass;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the marks");
		double marks=sc.nextDouble();
		
		if(marks>0) {
			
			    if(marks==60 && marks<70) {
			    	
			    	System.out.println("you have secured first division");
			    }
			    else {
			    	
			    	System.out.println("You  have got not got 60");
			    }
			
			 
			if(marks>70 && marks <=80) {
				
				System.out.println("you have got distinction");
			}
			else {
				
				System.out.println("you have not got grreater than 80");
			}
				
				
			
		}
		else {
			
			System.err.println("you have entered less than zero");
		}

	}

}
