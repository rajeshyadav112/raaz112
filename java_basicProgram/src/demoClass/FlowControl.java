package demoClass;

import java.util.Scanner;

public class FlowControl {
// write the java program to check the number divisible by 8 & also ends with 8
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("kripya number dabaye");
		int n=sc.nextInt();
		
		if(n%8==0&& n%10==8) {
			
			System.out.println("The number divisible by 8 & also ends with 8");
		}
		else {
			
			System.out.println("The number not divisible by 8 and ends with 8");
		}
		
		
		}
	}


