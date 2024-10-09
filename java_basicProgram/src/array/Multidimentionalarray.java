package array;

public class Multidimentionalarray {

	public static void main(String[] args) {
		
			//declaring and initializing 2D array  
			int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
			//printing 2D array  
			for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(arr[i][j]+" ");  
			 }  
			 System.out.println();  
			} 
			
			// 2nd example
			int a[][]=new int[2][3];
			
			a[0][0]=10;
			a[0][1]=20;
			a[0][2]=30;
			
			a[1][0]=40;
			a[1][1]=50;
			a[1][2]=60;
			
			
			
			for(int l=0;l<=a.length-1;l++) {
				
				for(int m=0;m<3;m++) {
					
					System.out.print(a[l][m]+" ");
				}
				System.out.println();
			}
		
		
			
			
    }


	}


