package basic;

public class Icici implements Bank,Bank2 {

	public static void main(String[] args) {
	
		    Bank b1=new Icici();
		    b1.roi();
		    
		    Bank2 b2=new Icici();
		    b2.roi();
	}

	@Override
	public void roi() {
		
		System.out.println("This is roi method ");
		
	}

}
