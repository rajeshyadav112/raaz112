package test;

public class vehicleChaining {
      
	     String name ;
	     String hp;
	     int price;
	    
	     vehicleChaining(){
	    	 
	    	 
	     }
vehicleChaining(String name ){
	    	this() ;
	    	this.name=name;
	    	 
	     }
vehicleChaining(String name,String hp){
	  this(name);
	  this.hp=hp;
	 
}
vehicleChaining(String name,String hp,int price){
	 
	 this(name,hp);
	 this.price=price;
}
public void display() {
	   
	   System.out.println("The name of vehicle is :"+this.name);
	   System.out.println("The hp of vehicle is :"+this.hp);
	   System.out.println("The price of vehicle is :"+this.price);
	   
	   
	   
}
public static void main(String[] args) {
	vehicleChaining	v1=new vehicleChaining("Dcavanti","70",3000000);
	v1.display();
}
	     
	     
	     
}
