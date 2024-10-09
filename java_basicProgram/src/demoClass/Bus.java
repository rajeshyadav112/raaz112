package demoClass;



public class Bus {

	String Brand;
	  String name;
	  int price;
	  
	public   Bus(String name) {
		
		this.name=name;
	}
	
	
	public Bus(String name ,String Brand) {
		
		this.name=name;
		 this.Brand=Brand;
	}
	
	  
	  public Bus(String name,String Brand,int price ){
		  
		 this. name=name;
		  this.Brand=Brand;
		  this. price=price;
		  
	  }
	  
	  public void display() {
		  
		  System.out.println("The name of Bus is:"+name);
		  
		  System.out.println("The brand of Bus is:"+this.Brand);
		  System.out.println("The price of Bus is:"+this.price);
	  }
	  
	  
	  
	
	
}

