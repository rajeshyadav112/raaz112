package basic;

public class BoleroDriver {

	public static void main(String[] args) {
		
		Bolero b1 = new Bolero("mahindra",800000.450);
		
		    b1.display();
		    System.out.println("====================");
		
		    Bolero b2 = new Bolero("mahindra",800000.450,"indian");
			
		    b2.display();
		    System.out.println("====================");

          Bolero b3 = new Bolero("mahindra",800000.450,"indian","Diesel");
			
		    b3.display();
		    System.out.println("====================");

	          Bolero b4 = new Bolero("mahindra",800000.450,"indian","Diesel",800);
				
			    b4.display();
			    System.out.println("====================");

	}

}
