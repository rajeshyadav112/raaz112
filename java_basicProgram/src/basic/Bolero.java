package basic;

public class Bolero {

	    String name;
	    double price;
	    String brand;
	    String type;
	    int engineCc;
	    
	Bolero(){
		
		System.out.println("this no argumnt constructor");	

}
	
	  Bolero(String name,double price){
		
		  this();
		  this.name=name;
		  this.price=price;
		 
	  }
	  
	  Bolero(String name,double price,String brand){
		 this(name,price);
		  this.brand=brand;
		  
	  }
	  Bolero(String name,double price,String brand,String type){
		  
		  this(name,price,brand);
		  this.type=type;
	  }
 Bolero(String name,double price,String brand,String type,int engineCc){
		  
	 this(name,price,brand,type);
		  this.engineCc=engineCc;
	  }
 public void display() {
	 
	 System.out.println("The name of boero is :"+this.name);
	 System.out.println("The price  of boero is :"+this.price);
	 System.out.println("The brand  of bolero  is :"+this.brand);
	 System.out.println("The Type of boero is :"+this.type);
	 System.out.println("The engineCc of boero is :"+this.engineCc);
 }
}
