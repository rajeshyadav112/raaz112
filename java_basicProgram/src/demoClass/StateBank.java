package demoClass;

import java.util.Scanner;

public class StateBank {
	     private   int pin=1234;
	     private String accName;
	     private int accno;
	     private String branch;
	     
	     Scanner sc=new Scanner(System.in);
	     public  String getaccName() {
	    	 
	    	 System.out.println("please enter your 4 digit pin");
	    	int x=sc.nextInt();
	    	
	    	if(x==pin) {
	    		
	    		   System.out.println("!!validation is successful!! ");
	    		  return accName;
	    	}
	    	else {
	    		   
	    		   System.err.println("!!Access denied!! please enter correct pin");
	    		return null;
	    	}
	    	 
	     }
	     
	     public void setaccName(String accName) {
	    	 
	    	 
	    	 System.out.println("please enter your 4 digit pin");
	    	int x=sc.nextInt();
	    	
	    	if(x==pin) {
	    		
	    		   System.out.println("!!validation is successful!! Name is set");
	    		   this.accName=accName;
	    	}
	    	else {
	    		   
	    		   System.err.println("!!Access denied!! please enter correct pin");
	    	     
	     }
	     
	     }

	    public static void main(String[] args) {
			StateBank b=new StateBank();
			b.setaccName("rajesh yadav");
	    	
		System.out.println(	b.getaccName());
			
		} 
}
