package classDemo;

public class Cardriver {

	public static void main(String[] args) {
		
         Car c1=new Car("Landrover","White",4000000.50);
         c1.display();
         System.out.println("==================");
         

         Car c2=new Car("Bugati","Grey");
         c2.display();
         System.out.println("==================");
         

         Car c3=new Car("nano");
         c3.display();
         System.out.println("==================");
	}

}
