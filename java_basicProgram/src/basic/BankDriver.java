package basic;

public class BankDriver {

	public static void main(String[] args) {
		
		Bank4 b1=new Axis();
		b1.roi();
		
		System.out.println("===============");
		Bank4 b2=new Statebank();
		b2.roi();
		System.out.println("===============");
		Bank4 b3=new BarodaBank();
		b3.roi();
		System.out.println("===============");
		Bank4 b4=new KotakBank();
		b4.roi();

	}

}
