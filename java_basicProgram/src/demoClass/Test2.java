package demoClass;

public class Test2  extends Test1{

	static String name="jack";
	String company="oracle";
	
	
	public static void main(String[] args) {
		

		Test2 t=new Test2();
		
		t.run();
		 System.out.println(name);
		
		 
		 
		
	}
	
	public void run() {
		
		System.out.println(super.name);
	}

}
