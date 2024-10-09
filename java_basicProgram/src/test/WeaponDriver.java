package test;

public class WeaponDriver {

	public static void main(String[] args) {
		
		weapon w1=new weapon();
		
		w1.setName("AK-47");
		w1.setPrice(150000.50);
		
		w1.setColor("Green");
		
		
	System.out.println(	w1.getName());
	System.out.println(	w1.getPrice());
	System.out.println(	w1.getColor());

	}

}
