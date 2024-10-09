package test;

public class Truck  extends Vehicle{

	  public void drive() {
		  
		  System.out.println("this drive method of Truck");
	  }
	  
	  public static void main(String[] args) {
		
		  Vehicle v1=new Vehicle();
		  
		     v1.drive();
		     
		     
		     Vehicle v2=new Truck();
		     v2.drive();
	}
}
