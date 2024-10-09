package basic;

public class JioCinema  extends Jio{

	
	public void livecricket() {
		
		   System.out.println();
	
	}
	
public static void main(String[] args) {
		
		Reliance r1=new Reliance();
		
		r1.purchase();
		r1.sales();
		
		System.out.println("==================");
		Jio j1=new Jio();
		j1.jiomart();
		j1.purchase();
		j1.sales();
		j1.ajio();
		
		System.out.println("==================");
		JioCinema c=new JioCinema();
		c.jiomart();
		c.livecricket();
		c.purchase();
		c.sales();
		c.ajio();
		c.jiomart();
		
		
	}
}
