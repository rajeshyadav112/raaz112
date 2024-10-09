package basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	    
		
		Scanner sc=new Scanner(System.in);
		
	    
		System.out.println("!!please select the correct number for Hindi press 1,english 2,marathi 3,for Telgu 4(1,2,3,4)");
		  int n=sc.nextInt();
		
		
		switch(n)
		{
		
		case 1:
			
			System.out.println("!! Hindi mein aapka swagat hai!!");
		break;
		
       case 2:
			
			System.out.println("Thank you for choosing English");
		break;
		
       case 3:
			
			System.out.println("marathi li sawagata aahe");
		break;
		
       case 4:
			
			System.out.println("wadakam");
		break;
		
		
		default :
			
			  System.err.println("The case value doese't  match with the switch value");
			
		}
		}
		
	}


