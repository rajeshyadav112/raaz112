package constuctor;

public class Vehicle {
	
	String name;
	String colour;
	double price;
	String brand;
	
	Vehicle(){
		
	}
	Vehicle(String name){
		this.name=name;
	}
	
	Vehicle(String name,String colour){
		this.name=name;
		this.colour=colour;
		
	}
	Vehicle(String name,String colour,double price){
		
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
Vehicle(String name,String colour,double price,String brand){
		
		this.name=name;
		this.colour=colour;
		this.price=price;
		this.brand=brand;
	}

  public void display() {
	  
	  System.out.println("The name of vehicle is:"+this.name);
	  System.out.println("The colour of vehicle is:"+this.colour);
	  System.out.println("The price of vehicle is:"+this.price);
	  System.out.println("The  of brand vehicle is:"+this.brand);
  }
	
	
	

}
