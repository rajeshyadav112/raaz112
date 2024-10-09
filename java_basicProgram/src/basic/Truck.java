package basic;

public class Truck {
	
	      String name;
	      double price;
	      String brand;
	      String colour;
	      
	   Truck(String name,double price,String brand,String colour){
		   
		       
		     this.name=name;
		     this.price=price;
		     this.brand=brand;
		     this.colour=colour;
		  
	   }
	   
	   public void display() {
		   
		     System.out.println("The name of Truck is:"+this.name);
		     System.out.println("The price  of Truck is:"+this.price);
		     System.out.println("The brand of Truck is:"+this.brand);
		     System.out.println("The colour of Truck is:"+this.colour);
	   }
	   public static void main(String[] args) {
		   
		Truck  t1= new Truck("tatamarcopolo",1200000,"TATA","saffron");
		
		   t1. display();
		   System.out.println("=================");
		   Truck  t2= new Truck("leyland",1300000,"AshokLeyand","Green");
		   
		   t2.display();
	}

}
