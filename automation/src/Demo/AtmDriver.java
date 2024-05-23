package Demo;

public class AtmDriver {

	public static void main(String[] args) {
		Atm a1=new Atm();
		
		a1.setAccountNo(27383788);
		
	System.out.println(	a1.getAccountNo());
	
	a1.setBankname("state bank of india");
	
	 System.out.println( a1.getBankname());
	   
	   a1.setBranch("noida");
	 System.out.println(  a1.getBranch());

	 a1.setType("saving account");
	 
	 System.out.println(a1.getType());
	}

}
