package basic;

public class ToreverseTheString {

	public static void main(String[] args) {
		
		  String word="welocome to the java to ducat to software testing";
		  
		  String reversed="";
		  
		  for(int i=word.length()-1;i>=0;i--) {
			  
			  reversed +=word.charAt(i);
			  
		  }
		  
		  //System.out.println("original string:"+word);
		  
		  //System.out.println("reversed string:"+reversed);
              
		  
		 boolean start = word.startsWith("w");
		 
		    System.out.println(start);
		    
		 System.out.println(  word.endsWith("k"));
		 
		System.out.println( word.length());
		
	String replace = word.replace("to", "in");
	
	    System.out.println(replace);
	    
	    
	}

}
