package test;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please  enter the cost price:");
		double cp=sc.nextDouble();
		System.out.println("please enter the selling price");
		double sp=sc.nextDouble();
		
		if(sp>cp) {
			
			    System.out.println("there is profit");
			    double profit=sp-cp;
			    double perPro=(profit*100)/cp;
			    System.out.println("The percentage of profit is:"+perPro+"%"+"  "+profit);
			    
		}
		else if(cp>sp) {
			
			       System.err.println("There is loss");
			       double loss=cp-sp;
			       double lossPer=(loss*100)/cp;
			       System.out.println("The loss percentage is:"+lossPer+"%"+"  "+loss);
		}
		
		else {
			
			  System.out.println("There is no profit no loss");
		}
		
		
		
}
}
