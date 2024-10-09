package classDemo;

import java.util.Scanner;

public class UserInputArrayRow_Col {

	public static void main(String[] args) {
	
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Please enter the no of rows");
		  int row=sc.nextInt();
		  
		  System.out.println("plese enter the no. of column");
		  
		  int col=sc.nextInt();
		  
		  int arr[][]=new int[row][col];
		  
		  // To add the elements in the array
		  System.out.println("Enter the elements of array");
		  
		  for(int i=0;i<row;i++) {
			  
			  for(int j=0;j<col;j++) {
				  
				  arr[i][j]=sc.nextInt();
			  }
		  }
		  
		  //To access the added elements from array
		  
		  for(int i=0;i<row;i++) {
			  
			  for(int j=0;j<col;j++) {
				  
				  System.out.print(arr[i][j]+ "");
			  }
			  System.out.println();
		  }
	}

}
