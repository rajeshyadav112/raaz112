package basic;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int n = sc.nextInt();
		
		int i=1;
		 int fact=1;
		while(i<=n) {
			
			 
			    fact=fact*i;
			  i++;
			  
		}
		System.out.println("The factoraial of"+n +":" +fact);
		
		

	}

}
