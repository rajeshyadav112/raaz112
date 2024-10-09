package demoClass;

import java.util.Scanner;

public class SwitchSatement {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int  c=sc.nextInt();
		
		switch(c) {
		
		case 1:
			System.out.println("hindi mein aapka swagat hai");
			  
			break;
			
			

		case 2:
			System.out.println("thank you for choosing english");
			  
			break;

		case 3:
			System.out.println("wadakam");
			break;

		case 4:
			System.out.println("janamasthami ko hardik badhai chha");
			break;
			
			default:
				System.out.println("you have selected wrong options");
		}
		
		
			    

	}

}
