package classDemo;

public class Array_2d {

	public static void main(String[] args) {
		
		   int arr[][]=new int[3][4];
		   
		   //adding the elements into the array
		    arr[0][0]=1;
		    arr[0][1]=2;
		    arr[0][2]=3;
		    arr[0][3]=4;
		    arr[1][0]=5;
		    arr[1][1]=6;
		    arr[1][2]=7;
		    arr[1][3]=8;
		    arr[2][0]=9;
		    arr[2][1]=10;
		    arr[2][2]=11;
		    arr[2][3]=12;
		  //accessing the elements from array
		    
		   for(int i=0;i<arr.length;i++) {
			   
			   for(int j=0;j<arr[i].length;j++) {
				   
				   
				   System.out.print(arr[i][j]+"");
			   }
			   System.out.println();
		   }
		    
		    
		    
		   
	}

}
