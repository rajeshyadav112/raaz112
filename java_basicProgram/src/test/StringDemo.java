package test;

import basic.Sbi;

public class StringDemo {

	public static void main(String[] args) {
		
		   StringBuilder s=new StringBuilder(" hello world");
		   
		   s.append(" my");
		   
		   
		  System.err.println(s);
		   
		
		  s.replace(5, 7," null");
		  
		  System.err.println(s);
		 System.out.println( s.indexOf("w"));
		 
	s.insert(10, "55");
	
	 
	 
	 System.err.println(s);
	
	 System.out.println( s.indexOf("w"));  
	 
	 
	 
	 System.err.println(s);
	 
	String s1 = s.toString();
	
	s1.trim();
	
	 System.err.println(s1.trim());
	
	
	}

}
