package constuctor;

public class MobileDriver {

	public static void main(String[] args) {
		
		Mobile m1= new Mobile("starlight");
		m1.display();
       
		System.out.println("====================================");
		
		Mobile m2=new Mobile("Nebula blue","oneplus",40000.50);
		
		m2.display();
		
		System.out.println("====================================");
		Mobile m3=new Mobile("Nebula blue","oneplus",40000.50,6.7);
		
		m3.display();
	}
	

}
