package demoClass;

import java.util.Scanner;

public class Mobile {
private int pin=1234;
private	String name;
private	String model;
private	int price;

	
	    public String getName() {
	    	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 4 digit pin");
	    int x=sc.nextInt();
	    	
	    if(x==pin) {
	    	 System.out.println("validation is successful");
	    
	    }
	    
	    else {
	    	
	    	   System.err.println("you have entered invalid pin: Access denied ");
	    }
	    return name;
	}
	   
	public String getModel()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 4 digit pin");
	    int x=sc.nextInt();
	    	
	    if(x==pin) {
	    	 System.out.println("validation is successful");
	    
	    }
	    
	    else {
	    	
	    	   System.err.println("you have entered invalid pin: Access denied ");
	    }
	    return model;
		
	}
	
	public int getPrice() {
		
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 4 digit pin");
	    int x=sc.nextInt();
	    	
	    if(x==pin) {
	    	 System.out.println("validation is successful");
	    
	    }
	    
	    else {
	    	
	    	   System.err.println("you have entered invalid pin: Access denied ");
	    }
	    return price;
	}
	
	public void setName( String name) {
		

		Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 4 digit pin");
	    int x=sc.nextInt();
	    	
	    if(x==pin) {
	    	 System.out.println("validation is successful");
	    	 this.name=name;
	    }
	    
	    else {
	    	
	    	   System.err.println("you have entered invalid pin: Access denied ");
		
		
	}
	}
	public void setModel( String model) {
		

		Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 4 digit pin");
	    int x=sc.nextInt();
	    	
	    if(x==pin) {
	    	 System.out.println("validation is successful");
	    	 this.model=model;
	    }
	    
	    else {
	    	
	    	   System.err.println("you have entered invalid pin: Access denied ");
		
		
	}
}
	public void setprice( int price) {
		

		Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 4 digit pin");
	    int x=sc.nextInt();
	    	
	    if(x==pin) {
	    	 System.out.println("validation is successful");
	    	 this.price=price;
	    }
	    
	    else {
	    	
	    	   System.err.println("you have entered invalid pin: Access denied ");
		
		
	}
}
}

	
	
