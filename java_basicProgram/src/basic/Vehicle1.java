package basic;

public class Vehicle1 {
	
	   
	    String name;
	    double  price;
	    String brand;
	    String Companyname;
	    
	   Vehicle1(){
		   
		   
	   }
	   
  Vehicle1(String name){
		   
	     this.name=name;
		   
	   }
  
  Vehicle1(String name,double price){
	   
	     this(name);
	     this.price=price;
		   
	   }
  Vehicle1(String name,double price,String brand){
	   
	     this(name,price);
	     this.brand=brand;
		   
	   }
  Vehicle1(String name,double price,String brand,String Companyname){
	   this(name,price,brand);
	     this.Companyname=Companyname;
		   
	   }
  
  
  public void display() {
	  
	  System.out.println("The name of Vehicle is:"+this.name);
	  
	  System.out.println("The price  of Vehicle is:"+this.price);
	  
	  System.out.println("The brand of Vehicle is:"+this.brand);
	  
	  System.out.println("The Companyname of Vehicle is:"+this.Companyname);
  }
	   
	   
	 

	public static void main(String[] args) {
		
		Vehicle1 v1 = new Vehicle1();
		
		v1.display();
		System.out.println("===================");
		Vehicle1 v2 = new Vehicle1("lamborgini");
		v2.display();
		System.out.println("===================");
		Vehicle1 v3 = new Vehicle1("HondaCity",1200000.0,"Honda","japaneseHonda");
		v3.display();

	}

}

