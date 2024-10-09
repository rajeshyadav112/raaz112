package classDemo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int n=sc.nextInt();
		
		
		for(int i=1;n!=0;i++) {
			
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
			
			
		}
		
		
		
	}
}