package string;

public class StringClassExample {

	public static void main(String[] args) {
		
		String name="abhishek ";
		
		String name2="Abhishek";
		
	System.out.println(name.charAt(2));
	
	System.out.println(name.concat(" pandit"));
	
	System.out.println(name);
	
	System.out.println(name.replace("ab", "ci"));
	
	System.out.println(name.equals(name2));
	
	System.out.println(name.equalsIgnoreCase(name2));
	
	System.out.println(name.length());
	
	int count =0;
     for(int i=0;i<name.length();i++){
    	 
    	 System.out.println( name.charAt(i));
    	 count ++;
    	 
     }
     
     
    System.out.println(name.trim());
     System.out.println("The total no. of character is :"+count);
	
	
    System.out.println(name.toUpperCase());
    
    
  System.out.println(name.startsWith("ab"));
  
  System.out.println(name.endsWith("k"));
  
  
  for(int j=name.length()-1;j>=0;j--){
 	 
 	 System.out.print( name.charAt(j));
 	 
 	 
  }
	}

}
