package inheritance;

public class Test1 extends Test {

	public static void main(String[] args) {
		Test t1= new Test();
		
		
		t1.demo();
		t1.run();
		
		Test1 t2= new Test1();
		
		t2.demo();
		t2.show();
		t2.run();
		t2.fire();
	}
	
	public  void fire() {
		
		System.out.println("this is fire method");
	}
	
	public  void show() {
		
		System.out.println("this is show method");
	}

}
