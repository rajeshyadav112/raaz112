package basic;

public class GamingLaptop  implements Maclaptop{

	@Override
	public void price() {
		System.out.println("The price of laptop is :10000rs");
		
	}

	@Override
	public void brand() {
		System.out.println("The brand of laptop is : dell");
		
	}

	@Override
	public void processor() {
		System.out.println("The processor of laptop is :ryzen 5 core");
		
	}

	@Override
	public void ssd() {
	   System.out.println("The ssd of laptop is :512 GB");
		
	}

	   public static void main(String[] args) {
		
		   Maclaptop m1=new GamingLaptop();
		   m1.brand();
		   m1.price();
		   m1.processor();
		   m1.ssd();
	}
}
