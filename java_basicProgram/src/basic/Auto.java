package basic;

public class Auto {

	  String name;
	  double price;
	  int seater;
	  String type;
	  
	  Auto(){
		  
		  
	  }
	  
	  Auto(String name,double price,int seater,String type){
		  
		  this.name=name;
		  this.price=price;
		  this.seater=seater;
		  this.type=type;
	  }
	  
	  public void display() {
		  
		    System.out.println("The name of Auto is :"+this.name);
		    System.out.println("The price of Auto is :"+this.price);
		    System.out.println("The seater of Auto is :"+this.seater);
		    System.out.println("The type of Auto is :"+this.type);
	  }
	  
	  public static void main(String[] args) {
		
		 Auto A1 = new Auto();
		 // intialization through object
		 A1.name="TaTaHitachi";
		
		 A1.display();
		 System.out.println("===========================");
		 Auto A2=new Auto("ashokLeyland",120000.78,4,"CNG");
		 
		 A2.display();
		 
	}
}

