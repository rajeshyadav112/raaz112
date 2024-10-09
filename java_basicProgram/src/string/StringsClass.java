package string;

public class StringsClass {

	public static void main(String[] args) {
		
		
		String s4=new String("dummy");
		
	  String s1="jonny";
	  String s2="rummy";
	 // forsingle character by index
	  //System.out.println(s1.charAt(4));

	 String rev="";
	 for(int i=s1.length()-1;i>=0;i--) {
		 
		 
		rev= rev+ s1.charAt(i);
	
	 }
	 System.out.print(	rev);

	 
	
	
	
		
	}

}
