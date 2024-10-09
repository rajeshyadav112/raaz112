package demoClass;

import java.util.Scanner;

public class Audi {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value of n:");
		int n=sc.nextInt();
		
		if(n%8==0 && n%10==8) {
			
			System.out.println("The number is ends with 8 and also divisible by 8");
			
		}
		else {
			     System.err.println("the number is no divesible by 8 and not ends with 8");
			 
		}
		
		
		
	
		
		
		
	}
}
