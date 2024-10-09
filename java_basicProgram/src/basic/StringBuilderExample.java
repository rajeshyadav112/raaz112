package basic;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("hello");
		
		System.out.println(   sb.append(" raaz"));
		
		  System.out.println(sb);
		  
		  
		 sb.insert(0,"hi");
		 
		 System.out.println(sb);
		 
		  sb.replace(0, 3, "jonny");
		  
		  System.out.println(sb);
		  
		    sb.delete(0, 3);
		    System.out.println(sb);
		    
		    sb.reverse();
		    
		    System.out.println(sb);
	}
 
}
