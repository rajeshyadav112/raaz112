package basic;

import java.util.Scanner;

public class Atm {
	   private   int pin=1234;
	   private   String accname;
	    private  String bankname;
	    private  int acno;
	    
	    Scanner sc=new Scanner(System.in);

		public String getAccname() {
			System.out.println("please enter your security pin");
			int securitypin=sc.nextInt();
			if(pin==securitypin) {
			return accname;
		}
			else {
				
				 return null;
			}
		}

		public void setAccname(String accname) {
			System.out.println("please enter your security pin");
			int securitypin=sc.nextInt();
			if(pin==securitypin) {
			   System.out.println("Thank you Validation is successful");
				this.accname=accname;
		}
			else {
				    System.err.println("!!please enter correct pin!!access is denied!!");
				
			}
			
		}

		public String getBankname() {
			System.out.println("please enter your security pin");
			int securitypin=sc.nextInt();
			if(pin==securitypin) {
				 System.out.println("Thank you Validation is successful");
			return accname;
		}
			else {
				
				System.err.println("!!Acess denied!! last two attempt is left to block!!");
				 return null;
			}
			
		}

		public void setBankname(String bankname) {
			System.out.println("please enter your security pin");
			int securitypin=sc.nextInt();
			if(pin==securitypin) {
				 System.out.println("Thank you Validation is successful");
			
				this.bankname = bankname;
		}
			else {
				    System.err.println("!!please enter correct pin!!access is denied!!");
				
			}
			
			
		}


		public int getAcno() {
			System.out.println("please enter your security pin");
			int securitypin=sc.nextInt();
			if(pin==securitypin) {
				 System.out.println("Thank you Validation is successful");
			return acno;
		}
			else {
				
				 return (Integer) null;
			}
			
		}


		public void setAcno(int acno) {
			int securitypin=sc.nextInt();
			if(pin==securitypin) {
				 System.out.println("Thank you Validation is successful");
			
				this.acno = acno;
		}
			else {
				    System.err.println("!!please enter correct pin!!access is denied!!");
				
			}
			
		}
	    
	    
	    
	      
	

}
