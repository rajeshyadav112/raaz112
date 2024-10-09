package basic;

public class Array {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		System.out.println(a.length);
		
		
		   a[0]=23;
		   a[1]=45;
		   a[2]=78;
		   a[3]=98;
		   a[4]=100;
		// System.out.println(a[4]);
		 
		 int b[]= {10,20,30,40,50,60};
		// System.out.println(b[3]);
		
		// Syntax for foreach loop
		// for(dataTypes variablename:array/collection)
		 
		    for(int x:b) {
		    	
		    	   System.out.print(x+" ");
		    }
	}

}
