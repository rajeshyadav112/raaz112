package basic;

import java.util.Scanner;

public class Bank3 {
	
	 private  int pin=1234;
	private   String bankname;
	private   int accountNo;
	private   String acctype;
	private   String branch;
	
	  Scanner sc=new Scanner(System.in);
	public String getBankname() {
		
		System.out.println("please enter your 4 digit pin");
		int x=sc.nextInt();
		if(x==pin) {
			
			System.out.println("!!Thank you!! validation is successful");
			return bankname;
			
		}
		
		else {
			
			   System.err.println("!!OOps!! Incorrect pin");
			   return null;
		}
		
		
	}
	public void setBankname(String bankname) {
		System.out.println("please enter your correct pin");
		int x=sc.nextInt();
		if(x==pin) {
			System.out.println("!!Thank you!! validation is successful");
			this.bankname = bankname;
		}
		
		else {
			    System.err.println("!!Sorry you have entered wrong pin");
		}
		
	}
	public int getAccountNo() {
		System.out.println("please enter your 4 digit pin");
		int x=sc.nextInt();
		if(x==pin) {
			
			System.out.println("!!Thank you!! validation is successful");
			return accountNo;
			
		}
		
		else {
			
			   System.err.println("!!OOps!! Incorrect pin");
			   return 0;
		}
		
		
	}
	public void setAccountNo(int accountNo) {
		System.out.println("please enter your correct pin");
		int x=sc.nextInt();
		if(x==pin) {
			System.out.println("!!Thank you!! validation is successful");
			this.accountNo = accountNo;
			
		}
		
		else {
			    System.err.println("!!Sorry you have entered wrong pin");
		}
		
		
	}
	public String getAcctype() {
		System.out.println("please enter your 4 digit pin");
		int x=sc.nextInt();
		if(x==pin) {
			
			System.out.println("!!Thank you!! validation is successful");
			return acctype;
			
		}
		
		else {
			
			   System.err.println("!!OOps!! Incorrect pin");
			   return null;
		}
		
		
	}
	public void setAcctype(String acctype) {
		System.out.println("please enter your correct pin");
		int x=sc.nextInt();
		if(x==pin) {
			System.out.println("!!Thank you!! validation is successful");
			this.acctype = acctype;
			
		}
		
		else {
			    System.err.println("!!Sorry you have entered wrong pin");
		}
		
	}
	public String getBranch() {
		System.out.println("please enter your 4 digit pin");
		int x=sc.nextInt();
		if(x==pin) {
			
			System.out.println("!!Thank you!! validation is successful");
			return branch;
			
		}
		
		else {
			
			   System.err.println("!!OOps!! Incorrect pin");
			   return null;
		}
		
		
	}
	public void setBranch(String branch) {
		System.out.println("please enter your correct pin");
		int x=sc.nextInt();
		if(x==pin) {
			System.out.println("!!Thank you!! validation is successful");
			this.branch = branch;
			
		}
		
		else {
			    System.err.println("!!Sorry you have entered wrong pin");
		}
		
		
	}

}
