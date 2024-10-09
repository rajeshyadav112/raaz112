package test;

public class Car {
  
	   String name;
	   String colour;
	   double price;
	   String brand;
	   
	   Car(String name,String colour,double price,String brand){
		   
		      this.name=name;
		     this.colour=colour;
		     this.price=price;
		     this.brand=brand;
	   }

	   Car(String name,String colour,double price){
		   
		      this.name=name;
		     this.colour=colour;
		     this.price=price;
		     
	   }
	   
	   
	   public void display() {
		   
		   System.out.println("The name of car is :"+this.name);
		   System.out.println("The colour of car is :"+this.colour);
		   System.out.println("The price of car is :"+this.price);
		   System.out.println("The brand  of car is :"+this.brand);
		   
		   
	   }

	   Car(String name,String colour){
		   
		      this.name=name;
		     this.colour=colour;
		     
	   }
	   

	   Car(String colour,double price){
		   
		      this.colour=colour;
		     this.price=price;
		     
	   }
	   public static void main(String[] args) {
		Car  c1=   new Car("harrier","Red",1200000.50,"TATA");
		c1.display();
		
		System.out.println("========================");
		Car c2=new Car("Duster","white",1100000.70,"Renault");
		 c2.display();
		 
		 System.out.println("========================");
		 Car  c3=   new Car("harrier","Red",1200000.50);
			c3.display();
			
			System.out.println("========================");
			Car  c4=   new Car("harrier","Red");
			c4.display();
			
			System.out.println("========================");
			Car  c5=   new Car("harrier",120006.90);
			c5.display();
			
			System.out.println("========================");
		   
	}
	 
}
