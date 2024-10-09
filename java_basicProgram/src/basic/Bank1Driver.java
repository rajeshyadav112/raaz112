package basic;

public class Bank1Driver {

	public static void main(String[] args) {
		
		Bank1 b1=new Kotak();
		b1.roi();
		
		System.out.println("=============");
		
		Bank1 b2=new Baroda();
		
		b2.roi();
         
		Bank1 b3 =new IDFC();
		b3.roi();
	}

}
