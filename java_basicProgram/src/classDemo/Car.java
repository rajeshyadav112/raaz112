package classDemo;

public class Car { 

	     String Type;
	     String colour;
	     int price;
	     String engine;
	     
	     Car(String Type){
	    	 
	    	 this.Type=Type;
	    	 
	     }
	     
	     Car(String Type,String colour){
	    	   this(Type);
	    	   this. colour=colour;
	    	   
	    	 
	     }
	     Car(String Type,String colour ,int price){
	    	   this(Type,colour);
	    	   this.price =price;
	    	   
	    	 
	     }
	     Car(String Type,String colour ,int price,String engine){
	    	   this(Type,colour,price);
	    	  
	    	   this.engine=engine;
	    	 
	     }
	     
	     public void display() {
	    	 
	    	  System.out.println(this.Type);
	    	  System.out.println(this.price);
	    	  System.out.println(this.colour);
	    	  System.out.println(this.engine);
	     }
	    public static void main(String[] args) {
			
	    	Car c1=new Car("Sports","blue",10000,"diesel");
	    	c1.display();
	    	
		} 
	     
	     
	     
}
	     
	
