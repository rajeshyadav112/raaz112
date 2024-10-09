package demoClass;

public class Vehicle {

	
	String name;
	String brand;
	double price;
	
	 Vehicle(){
		 
		 
		 
	 }
	 
	 Vehicle(String name,String brand,double price){
		 
		 this.name=name;
		 this.brand=brand;
		 this.price=price;
	 }
	 
	 public void display() {
		 
		 System.out.println("The name of vehicle is: "+this.name);
		 System.out.println("The brand of vehicle is: "+this.brand);
		 System.out.println("The pricr of vehicle is: "+this.price);
		 
		 
	 }
	 
	 
	int x;
	
	
}


