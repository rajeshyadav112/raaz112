package Interface;

public class Bank1driver {

	public static void main(String[] args) {
		
		Bank1 b1=new Hdfc1();
		b1.roi();
		
		Bank1 b2=new Sbi1();
		b2.roi();
		
		Bank1 b3=new Icici();
		b3.roi();
	}

}
