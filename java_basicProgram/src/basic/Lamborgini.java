package basic;

public class Lamborgini extends Car {

	@Override
	public void playmusic() {
		
		  System.out.println("play a verygood hindi music");
		
	}

	@Override
	public void openSunRoof() {
		
		System.out.println("open sunroof for sunlight");
	}

	@Override
	public void drive() {
		System.out.println("Drive is the art of life");
		
	}

	@Override
	public void ride() {
		System.out.println("ride with all the safety guidelines");
		
		
	}
	public static void main(String[] args) {
		
		   Car c1   =new Lamborgini();
		   
		   c1.drive();
		   c1.openSunRoof();
		   c1.ride();
		   c1.seatbelt();
		   c1.playmusic();
		   c1.start();
	}
	
	   

}
