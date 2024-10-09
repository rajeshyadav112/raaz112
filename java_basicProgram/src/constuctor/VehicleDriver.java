package constuctor;

public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Bugati","Blue");
		v1.display();
		
		
		System.out.println("===============================");
		
		Vehicle v2 = new Vehicle("Ferrari","Red",10000000.0,"Ferrari Brand");
		v2.display();
		
		
	}

}
