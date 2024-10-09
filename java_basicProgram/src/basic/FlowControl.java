package basic;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		
		Scanner   sc =new Scanner(System.in);
		System.out.println("please enter the cost price of the item");
		double cp=sc.nextDouble();
		
		System.out.println("please enter the selling price of the item");
		double sp=sc.nextDouble();
		
		if(sp>cp) {
			
			     System.out.println("we are in profit");
			     double profit=sp-cp;
			     double profitPer= (profit*100)/cp;
			     System.out.println("Percentage of profit is"+profitPer+"%");
		}
		else if(cp>sp) {
			
			System.err.println("!!uuh!! we are in loss");
			double loss=cp-sp;
			double lossPer=(loss*100)/cp;
			System.out.println("The loss percentage is "+lossPer+"%");
		}
		else {
			  System.out.println("We are at breakeven point:"+"There is no losss no profit");
		}
	}

}
