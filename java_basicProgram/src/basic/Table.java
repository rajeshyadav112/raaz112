package basic;

public class Table {

	public static void main(String[] args) {
		
		   Table T1 = new Table();
		   Table T2 = new Table();
		   
	 T1.  Loop();
	    
	    System.out.println(T1);
	    System.out.println(T2);
        
}
	
	  public  void Loop() {
		  
		   int [] elements= {1,2,3,4,4,5,6,7};


		   // for(datatypes variablename:array/collection){

		         for(int value:elements)  {
		         	
		         	
		         	   System.out.println(value);
		         }
	  }
	
}