package classDemo;

import java.util.Scanner;

public class AK_47  extends Weapon{

     Scanner sc=new Scanner(System.in);
	  public void fire() {
		  
		  
		  System.out.println("press 1 for sigle shot and 2 for automatic brust");
		  int x=sc.nextInt();
		  
		  if (x==1) {
			  
			     System.err.println(" single shot is dhichkyasu=======>>>");
		  }
		  else if(x==2) {
			  int i=1;
			   while(i>0) {
				   System.err.println("  dhichkyau=======>>>"); 
				   
				   i++;
				   
			   }
		  }
	  }
	  
}
