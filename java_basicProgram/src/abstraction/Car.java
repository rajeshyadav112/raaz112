package abstraction;

public abstract class Car extends Vehicle {
	
	public static void main(String[] args) {
		
		  Car  d1=new Car();
		
		    d1.demo();
		    d1.run();
		    d1.play();
		  

	}
	
	@Override
	public void run() {
		System.out.println("This is the run method");
		
	}

	@Override
	public void demo() {
		
		System.out.println("==njdsjcijs");
	}
	
	

}
