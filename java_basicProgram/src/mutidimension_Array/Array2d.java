package mutidimension_Array;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
	
		int arry[][]=new int[3][3];
		
		System.out.println("enter the elements of array");
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			
			
			for(int j=0;j<3;j++) {
				
				  arry[i][j]=sc.nextInt();
			}
			
		}
         for(int i=0;i<3;i++) {
			
			
			for(int j=0;j<3;j++) {
				
				System.out.print(arry[i][j] + "");
			}
			System.out.println();
		}
		
}
}
