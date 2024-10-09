package methodOverloading;

public class Calculator {

	public static void main(String[] args) {
		
		sum(10,20,30);
		sum(10,20.0);
		sum(30.5,50);
		sum(30,40);
		
	}

	  public static void sum(int a,int b) {
		  
		  System.out.println("the sum of a and b is :"+(a+b));
	  }
	  
	  public static void sum(double a,int b) {
		  System.out.println("the sum of double and int :"+(a+b));
		  
	  }
	  public static void sum(int a,double b) {
		  
		  System.out.println("the sum of int  and double is :"+(a+b));
	  }
	  public static void sum(int a,int b,int  c) {
		  System.out.println("the sum of 3 int is :"+(a+b+c));
	  }
}
