package basic;

public class Maruti {
	
	   String name;
	   String brand;
	   double price;
	   String type;
	   
	   Maruti(String name){
		   this.name=name;
		     
	   }    
	   
	
	   
	   Maruti(String name,String brand){
		   //this call statement/constructor call
		   this(name);
		      this.brand=brand;
	   }    
	   
	   Maruti(String name,String brand,double price){
		   this(name,brand);
		      this.price=price;
		   
	   }
	   Maruti(String name,String brand,double price,String type){
		   
		      this(name,brand,price);
		      this.type=type;
		   
	   }
	   
	   public void display() {
		   
		   System.out.println("The name of maruti is :"+this.name);
		   System.out.println("The brand of maruti is :"+this.brand);
		   System.out.println("The price of maruti is :"+this.price);
		   System.out.println("The type of maruti is :"+this.type);
	   }
	   public static void main(String[] args) {
		
		   
		   Maruti m3=new Maruti("desire","suzuki",123000.7);
		   
		       m3.display();
		       System.out.println("================");
		 Maruti m1 = new Maruti("grand vitara","Suzuki",120000.50,"Diesel");
		 
		    m1.display();
		    
		    System.out.println("================");
		    Maruti m2=new Maruti("Fortuner","Toyota",140000.69,"Petrol");
		    
		       m2.display();
		       
		       System.out.println("================");
		       Maruti m4=new Maruti("innova","Toyota");
			    
		       m4.display();
		           
		    
		 
		   
	}
		   

}
