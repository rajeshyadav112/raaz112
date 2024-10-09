package demoClass;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("please enter the cost price");
		int cp=sc.nextInt();
		
		System.out.println("please enter the selling price");
		int sp=sc.nextInt();
		
		
			
		
		if(sp>cp && sp>0) {
			
			System.out.println("there is profit");
		}
		
		else if(cp>sp &&cp>0) {
			
			System.out.println("there is loss");
		}
		
		else if(cp==sp) {
			
			System.out.println("there is no profit no loss");
		}
		
		else {
			
			
			System.err.println(" you have entered invalid data");
		}
		
		
		
		
	}

}
