package abstraction;

public class Vehicledriver {

	public static void main(String[] args) {
		
		Car c1=new ElectricCar();
		
		c1.opengate();
		c1.drive();
		c1.accelerate();
		c1.start();
		c1.stop();
		

	}

}
