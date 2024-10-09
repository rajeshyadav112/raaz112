package mutidimension_Array;

import java.util.Scanner;

public class Array2byuserinput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows");
		
		int row=sc.nextInt();
		System.out.println("enter the no.of rows");
		int colm=sc.nextInt();
		
	   int arr[][]=new int[row][colm];
	   
	   System.out.println("enter the elements of array");
	   
	   for(int i=0;i<row;i++) {
		   
		   
		   for(int j=0;j<colm;j++) {
			   
			    arr[i][j]=sc.nextInt();
			    		
		   }
	   }
	   //Accessing elements of array
         for(int i=0;i<row;i++) {
		   
		   
		   for(int j=0;j<colm;j++) {
			   
		       System.out.print(arr[i][j]);
			    		
		   }
		   System.out.println();
	   }
		

	}

}
