package constuctorOverloading;

public class Car {
	
	         String name;
	         String brand;
	         double price;
	         String hp;
	
	Car(){
		
		 
	}
	
	Car(String name){
		
		this();
		this.name=name;
		
	}
	
	Car(String name,String brand){
		
		this(name);
		
		this.brand=brand;
		
	}
	
	Car(String name,String brand,double price){
		
		this(name,brand);
		
		this.price=price;
		
		
	}

	Car(String name,String brand,double price,String hp){
		this(name,brand,price);
		this.hp=hp;
	
	}
	
	Car(Car c){
		
		this.name=c.name;
		this.brand=c.brand;
		this.hp=c.hp;
		this.price=c.price;
		
	}
	public void display() {
	
     System.out.println("The name of car is :"+this.name);
     System.out.println("The brand of car is :"+this.brand);
     System.out.println("The price of car is :"+this.price);
     System.out.println("The hp of car is :"+this.hp);
}
}
