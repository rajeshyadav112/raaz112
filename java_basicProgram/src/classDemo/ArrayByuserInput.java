package classDemo;

import java.util.Scanner;

public class ArrayByuserInput {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		
		   System.out.println("enter the elements of the array");
		   Scanner sc=new Scanner(System.in);
		   
		   for(int i=0;i<3;i++) {
			   
			   for(int j=0;j<3;j++) {
				   
				     a[i][j]=sc.nextInt();
			   }
		   }
		   
		   
		   //To access the elements of array
		   
		   for(int i=0;i<3;i++) {
			   
			   for(int j=0;j<3;j++) {
				   
				   System.out.print(a[i][j] + "");
			   }
			   System.out.println();
		   }
	}

}
