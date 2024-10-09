package basic;

public class BikeDriver extends Bullet {

	public static void main(String[] args) {
		
		Bullet b1=new BikeDriver();
		
		b1.accelerate();
		b1.ride();
		b1.kick();
		b1.startEngine();
		b1.stop();

	}

	@Override
	public void stop() {
		System.out.println("Stop the bullet");
		
	}

	@Override
	public void accelerate() {
		
		System.out.println("accelaerate the bullet");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Start the BikeEngine ");
		
	}

	@Override
	public void ride() {
		System.out.println("!!ready to rock!!");
		
	}

}
