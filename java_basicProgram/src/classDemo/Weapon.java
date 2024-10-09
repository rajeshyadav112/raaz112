package classDemo;

import java.util.Scanner;

public class Weapon {
	
	    
	Scanner sc= new Scanner(System.in);
	  public void  selectWeapon() {
		  
		    System.out.println("please choose the weapon for antblastic bramhos 1,For agni 2");
		    int n=sc.nextInt();
		    
		    switch(n) {
		    
		    case 1:
		    	   System.out.println("You have got brahamhos misssile>>>>>==========>>>>");
		    	   break;
		    	   
		    
		    
	    case 2:
	    	   System.err.println("You have got agni misssile>>>>>==========>>>>");
	    	   break;
		    
		    } 
	  }

}
