package basic;

public class TataHitachi  extends Jindal{

	public static void main(String[] args) {
		
		
		Jindal j1=new TataHitachi();
		
		j1.jindalsteel();
		j1.marcopolo();
		j1.product();
		j1.tatasteel();
		j1.steelgrade();
	}
	  
	  

	@Override
	public void steelgrade() {
	
		System.out.println("jindal is providing high garade steeel");
		
	}

	@Override
	public void product() {
		
		System.out.println("product is good ");
		
	}

	@Override
	public void marcopolo() {
		System.out.println("Tata marcopolo is verygood brand in transportation");
		
	}

	@Override
	public void tatasteel() {
		
		System.out.println("Tata steel is a grandfather of jindal");
		
	}
}
