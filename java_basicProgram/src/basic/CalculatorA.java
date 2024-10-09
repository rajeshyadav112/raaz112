package basic;

public class CalculatorA {

	
	    String name;
	    int price;
	    double size;
	    String brand;
	
	  CalculatorA(){
		  
		  
	  }
	  
	  
  CalculatorA(String name,int price,double size,String brand){
		  
	      this.name=name;
	      this.price=price;
	      this.size=size;
	      this.brand=brand;
		  
	  }
  
  public void display() {
	  
	  System.out.println("The name of calculator is :"+this.name);
	  System.out.println("The price of calculator is :"+this.price);
	  System.out.println("The name of calculator is :"+this.size);
	  System.out.println("The name of calculator is :"+this.brand);
  }
  public static void main(String[] args) {
	
	  CalculatorA c1=new CalculatorA();
	  c1.display();
	  System.out.println("========================");
	  CalculatorA c2=new CalculatorA("Casio",500,12.34,"cisco");
	  
	  c2.display();
}
	  
}

