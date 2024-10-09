package test;

public class FoodDriver {

	public static void main(String[] args) {
		
		Food f1= new  Food();
		
		f1.cook();
		f1.eat();
		
		
		System.out.println("==============================");
		Dosa d1=new Dosa();
		
		d1.cook();
		d1.eat();
		d1.masala();
		d1.mysoreMasala();

	}

}
