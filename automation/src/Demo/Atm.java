package Demo;

import java.util.Scanner;

public class Atm {
	
	private   int pin=1234;
	private   String bankname;
	private   int accountNo;
	private   String type;
	private   String branch;
	
	    Scanner sc=new Scanner(System.in);
	public String getBankname() {
		
		  System.out.println("please enter the correct pin");
		  int x=sc.nextInt();
		  
		  if(x==pin) {
		
			   System.out.println("!!Thank you!! validation is successful"); 
		return bankname;
	}
		  else {
			  
			  System.err.println("!!Acess denied!!please enter your correct pin");
			  return null;
		  }
	}
	public void setBankname(String bankname) {
		
		  System.out.println("please enter your pin");
		  int x=sc.nextInt();
		  if(x==pin) {
			  System.out.println("!!Thank you!! validation is successful");
		this.bankname = bankname;
	}
		  else {
			  
			     System.err.println("!!oops!! access denied, you have entered wrong pin");
		  }
	}
	public int getAccountNo() {
		 System.out.println("please enter the correct pin");
		  int x=sc.nextInt();
		  
		  if(x==pin) {
		
			   System.out.println("!!Thank you!! validation is successful"); 
		return accountNo;
	}
		  else {
			  
			  System.err.println("!!Acess denied!!please enter your correct pin");
			  return 0;
		  }
		
	}
	public void setAccountNo(int accountNo) {
		 System.out.println("please enter your pin");
		  int x=sc.nextInt();
		  if(x==pin) {
			  System.out.println("!!Thank you!! validation is successful");
		this.accountNo =accountNo;
	}
		  else {
			  
			     System.err.println("!!oops!! access denied, you have entered wrong pin");
		  }
		
	}
	public String getType() {
		  System.out.println("please enter the correct pin");
		  int x=sc.nextInt();
		  
		  if(x==pin) {
		
			   System.out.println("!!Thank you!! validation is successful"); 
		return type;
	}
		  else {
			  
			  System.err.println("!!Acess denied!!please enter your correct pin");
			  return null;
		  }
		
	}
	public void setType(String type) {

		  System.out.println("please enter your pin");
		  int x=sc.nextInt();
		  if(x==pin) {
			  System.out.println("!!Thank you!! validation is successful");
		this.type = type;
	}
		  else {
			  
			     System.err.println("!!oops!! access denied, you have entered wrong pin");
		  }
		
	}
	public String getBranch() {
		  System.out.println("please enter the correct pin");
		  int x=sc.nextInt();
		  
		  if(x==pin) {
		
			   System.out.println("!!Thank you!! validation is successful"); 
		return branch;
	}
		  else {
			  
			  System.err.println("!!Acess denied!!please enter your correct pin");
			  return null;
		  }
		
	}
	public void setBranch(String branch) {
		  System.out.println("please enter your pin");
		  int x=sc.nextInt();
		  if(x==pin) {
			  System.out.println("!!Thank you!! validation is successful");
		this.branch = branch;
	}
		  else {
			  
			     System.err.println("!!oops!! access denied, you have entered wrong pin");
		  }
		
	}

}
