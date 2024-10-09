package test;

public class Calc {

	public static void main(String[] args) {
		
		Calc c=new Calc();
		
		sum(30.5,40);
		sum(10,20,50.5);
		sum(40,50,20);
		sum(90,40);
		
	}
	
	
	public static void sum(int a,int b) {
		
		System.out.println("The sum of & b is "+(a+b));
	}
	
	public static void sum(int a,int b,int c) {
		
		System.out.println("The sum of & b,c is "+(a+b+c));
	}
public static void sum(int a,int b,double d) {
		
		System.out.println("The sum of & b ,d is "+(a+b+d));
	}
public static void sum(double a,int b) {
	
	System.out.println("The sum of & b is "+(a+b));
}


}
