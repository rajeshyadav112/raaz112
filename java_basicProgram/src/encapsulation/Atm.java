package encapsulation;

import java.util.Scanner;

public class Atm {
   private int pin=123;
	private String name;
	private String color;
	private double price;
	
	public String getName() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter correct pin");
		int x=sc.nextInt();
		if(x==pin) {
		System.out.println("validation is successful");
		
		}
		else {
			System.out.println("You have entered wrong pin");
		}
		 
		
		return name;
		
	}
	
	
	public void setName(String name) {
		
		 Scanner sc=new Scanner(System.in);
			System.out.println("Please enter correct pin");
			int x=sc.nextInt();
			if(x==pin) {
				System.out.println("validation is successful and name is set");
				this.name=name;
	     }
			else {
				System.out.println("You have entered wrong pin");
			}
			 
		
}
}
