package classDemo;

public class ArrayProgram {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		
		String name[]= {"ram","shyam","hari","geeta","sita"};
		
		a[0]=20;
		a[3]=30;
		
		//System.out.println(a[0]);
		//System.out.println(a[3]);
		
		//System.out.println(a[2]);
		
		
		//syntax of for eachloop
		// for(datatypes variablename:array/collection){
		
		//}
		
		for(int x:a) {
			
			  System.out.println(x);
		}
	
	}

}
