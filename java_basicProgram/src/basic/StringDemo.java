package basic;

public class StringDemo {

	public static void main(String[] args) {
	
		  String name="jacky javaa";
		  
		 String upper = name.toUpperCase();
		 
		 System.out.println(name.toUpperCase());
		 System.out.println(name);
		 
		System.out.println( name.trim());
		
		   String brand="uspolo" ;
		   
		   
		System.out.println(  brand.equals(name));
		
		System.out.println(  brand.equalsIgnoreCase(name));
		
	System.out.println(	name.charAt(0));
	
	// to count the no of characters
	
	
	  int count=0;

	      for(int i=0;i<name.length();i++)  {
	    	  
	    	    if(name.charAt(i)!=' ') {
	    	    	
	    	    	 count++;
	    	    }
	      }
	      
	      System.out.println(count);
	    
	}

}
