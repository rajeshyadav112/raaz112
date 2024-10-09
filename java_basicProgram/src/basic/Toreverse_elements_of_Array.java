package basic;

import java.util.Arrays;

public class Toreverse_elements_of_Array {

	public static void main(String[] args) {
		
		int a []=new int[5];
		
		a[0]=16;
		a[1]=12;
		a[2]=14;
		a[3]=19;
		a[4]=17;
		
		/*for(int x:a) {
			
			//System.out.println("The elements of array are:"+x);
		}
		To reverse the elements of array 
		
		System.out.println("============================");
	for(int i=a.length-1;i>=0;i--) {
			
			//System.out.println("The reverse element of array is:"+a[i]);
		}
		*/
		//To sort the array elements
		 Arrays.sort(a);
		 
		 for(int x:a) {
				
				System.out.println("The elements of array are:"+x);
			}
	}

}
