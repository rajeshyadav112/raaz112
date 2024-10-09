package test;

public class AnimalDriver {

	public static void main(String[] args) {
	
		  Animal a=new Animal();
		    a.cry();
		    a.run();
		  
		    System.out.println("=====================");
		  Cat c=new Cat();
		  
		  c.cry();
		  c.run();
		  c.laugh();
		  c.sing();
		  System.out.println("====================="); 
		  
		 /* Dog d=new Dog();
		  d.cry();
		  d.laugh();
		  d.run();
		  d.bark();
		  d.sing();
		  d.jump();
		  */
		  //multilevel
		  Dog d=new Dog();
		  d.bark();
		  d.cry();
		  d.jump();
		  d.run();
		  //upcasting
		  Animal a1=new Dog();
		  a1.cry();
		  a1.run();
		 //down casting
		  Dog d1=(Dog)a1;
		  d1.bark();
		  d1.cry();
		  d1.jump();
		  
	}

}
