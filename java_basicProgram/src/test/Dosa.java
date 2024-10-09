package test;

public class Dosa {
	
	
	
	public static void main(String[] args) {
		
		         Dosa d = new Dosa();
		d.loop(1,0);
		
	}
	
	
public void loop(int i,int sum) {
		
        
		
		while(i<=10) {
			
			sum=sum+i;
			
			i++;
			
		}
		System.out.println(sum);
	}
	
}
