package constuctorOverloading;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.display();
		
		System.out.println("========================");
		Car c2=new Car("HondaCity");
		c2.display();
		
		System.out.println("========================");
       
		Car c3=new Car("Desire","suzuki");
		c3.display();
		System.out.println("========================");
		

		Car c4=new Car("DcAvanti","Avanti",3000000.5);
		c4.display();
		System.out.println("========================");
		
		Car c5=new Car(c4) ;
		c5.display();
		
		
		
	}

}
