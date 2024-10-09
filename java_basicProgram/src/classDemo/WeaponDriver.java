package classDemo;

public class WeaponDriver {

	public static void main(String[] args) {
	  
		Insaas i=new Insaas();
		i.fire();
		i.fireBomb();
		i.selectWeapon();
		
		System.out.println("+++++++++++++++");
		Rocket r=new Rocket();
		r.selectWeapon();
		r.launch();

	}

}
