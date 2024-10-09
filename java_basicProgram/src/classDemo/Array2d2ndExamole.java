package classDemo;

public class Array2d2ndExamole {

	public static void main(String[] args) {
	
		
		int arr[][]= {
				
				{1,2,3},
				{2,3,4},
				{4,5,6}
		};
		
		
		//Accesing the elements from array
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				  System.out.print(arr[i][j]+ ""); 
			}
			System.out.println();
		
		}

	}

}
