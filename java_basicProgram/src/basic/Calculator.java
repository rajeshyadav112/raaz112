package basic;

public class Calculator {

	public static void main(String[] args) {
		
		   Calculator c1 = new Calculator();
		   
		  sum(10.5,20,50.5);
		c1.  sum(10,10);
		c1.  sum(10,20,30);
		c1.  sum(10,30.5,40.02);
		  
		  

	}
	
	
	public  void sum(int a,int b) {
		
		System.out.println("The sum of a & b is :"+(a+b));
	}
	
	public  void sum(int a,int b,int c) {
		
		System.out.println("The sum of a &b is :"+(a+b+c));
		
	}
	
	public void sum(int a,double b,double c) {
		
		System.out.println("The sum od a ,b & c is :"+(a+b+c));
		
	}
	
	public static void sum(double a,int b,double c) {
		
		System.out.println("The sum of a,b,c is :"+(a+b+c));
	}
	
	
	
	

}
