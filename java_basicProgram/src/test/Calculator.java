package test;

public class Calculator {

	public static void main(String[] args) {
		
          sum(20.40,30);
          sum(10,20,30);
          sum(40,30,50.434);
          sum(54,64);
	}
	
	public static void sum(int a,int b) {
		
		System.out.println(a+b);
		
	}
	public static void sum(int a,int b,int c) {
		
		System.out.println(a+b+c);
		
	}
	public static void sum(int a,int b,double c) {
	
	System.out.println(a+b+c);
	
}
	public static void sum(double a,int b) {
	
	System.out.println(a+b);
	
}


	
	

}
