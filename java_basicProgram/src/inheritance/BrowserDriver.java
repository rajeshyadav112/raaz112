package inheritance;

public class BrowserDriver{

	public static void main(String[] args) {
		
		Browser b1=new Browser() ;
			
			b1.launch();
	
		System.out.println("=============================");	
		chrome c1=new chrome();
		c1.launch();
		c1.run();

	}

}
