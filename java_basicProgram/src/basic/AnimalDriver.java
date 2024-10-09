package basic;

public class AnimalDriver {

	public static void main(String[] args) {
		
		Animal a1=new Animal();
		
		//upcasting/overriding
		Animal a2=new Dog();
		
		a2.run();
		
		Animal a3=new Dog();
		//Downcasting
		Dog d=(Dog)a3;
		
		d.bark();
		d.run();

	}

}
