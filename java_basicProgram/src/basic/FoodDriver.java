package basic;

public class FoodDriver implements Roti {

	public static void main(String[] args) {
		
		   FoodDriver f1=new FoodDriver();
		   
		   f1.cook();
		   f1.eat();
		   f1.pack();
        
	}

	@Override
	public void eat() {
	
		System.out.println("This is eat method of food");
	}

	@Override
	public void pack() {
	System.out.println("pack the food");
		  
	}

	@Override
	public void cook() {
		System.out.println("cook the  roti");
		
	}

}
