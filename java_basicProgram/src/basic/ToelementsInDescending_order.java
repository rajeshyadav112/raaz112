package basic;

public class ToelementsInDescending_order {

	public static void main(String[] args) {
		
		int arr[]= new int[] {5,2,8,7,1};
		
		int temp=0;
		
		// to sort array in descending order
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				 if(arr[i]<arr[j]) {
					 
					  temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				 }
			}
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
