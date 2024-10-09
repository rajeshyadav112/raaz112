package demoClass;

import java.util.Scanner;

public class AtmMachine {
       private int pin=123;
	   private String name;
	    private int machineId;
	   private  double price;
	   
	   public String getName() {
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("please enter your pin");
		   int x=sc.nextInt();
		   
		   if(x==pin) {
			   
		   }
		   else {
			       System.out.println("please enter correct pin");
		   }
		   return name;
	   }
	   
	   public void setName(String name) {
		   
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("please enter your pin");
		   int x=sc.nextInt();
		   
		   if(x==pin) {
			   
		   }
		   else {
			       System.out.println("please enter correct pin");
		   }
		   this.name=name;
		   
	   }
	   
	   public int getMachineId() {
		   
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("please enter your pin");
		   int x=sc.nextInt();
		   
		   if(x==pin) {
			   
		   }
		   else {
			       System.out.println("please enter correct pin");
		   }
		   return machineId;
	   }
	   
 public void setMachineId(int machineId) {
		   
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("please enter your pin");
		   int x=sc.nextInt();
		   
		   if(x==pin) {
			   
		   }
		   else {
			       System.out.println("please enter correct pin");
		   }
		   this.machineId=machineId;
 }   
	   public double getPrice() {
		   
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("please enter your pin");
		   int x=sc.nextInt();
		   
		   if(x==pin) {
			   
		   }
		   else {
			       System.out.println("please enter correct pin");
		   }
		   
		   return price;
	   }
	   
	   public void setPrice(double price) {
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("please enter your pin");
		   int x=sc.nextInt();
		   
		   if(x==pin) {
			   
		   }
		   else {
			       System.out.println("please enter correct pin");
		   }
		   this.price=price;
	   }
	    

}

