package basic;

public class Mobiledriver extends Vivo  {

	public static void main(String[] args) {
		
		Vivo v1=new Mobiledriver();
		v1.camera();
		v1.charger();
		v1.game();
		v1.playmusic();

		v1.selfie();
	}

	@Override
	public void takeSceenshot() {
		System.out.println("take screenshot method");
		
	}

	@Override
	public void camera() {
		System.out.println("wow camera quality is very good");
		
	}

	@Override
	public void playmusic() {
		System.out.println("play the haryanwi music");
		
	}

	@Override
	public void game() {
	  System.out.println("pubg is is dangerous game for life");
		
	}

}
