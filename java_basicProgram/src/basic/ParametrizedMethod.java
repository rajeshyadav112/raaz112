package basic;

public class ParametrizedMethod {

	public static void main(String[] args) {
		   
		int x =sum(10,20,30);
		
		   System.out.println("The return value sum is :"+(x+40));
		   
	}
	
	
	public static int sum(int a,int b, int c) {
		
		 
		      int Totalsum=a+b+c;
		      
		      System.out.println(Totalsum);
		return Totalsum;
	}

}
