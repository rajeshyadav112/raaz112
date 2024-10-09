package demoClass;

public class BankDriver {

	public static void main(String[] args) {
		
		Bank b1=new Hdfc();
		b1.roi();
		
		System.out.println("==========================");
		
		Bank b2=new Sbi();
		b2.roi();
		System.out.println("==========================");
		
		Bank b3=new Icici();
		b3.roi();
		
	}

}
