package basic;

public class ToprintduplicateElementsFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,3,5,4,4};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("The duplicate elements in arraya is:"+a[j]);
				}
			}
		}
	}

}
