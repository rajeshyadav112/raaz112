package demoClass;

public class Pencil extends Pen {
	
	      public void lead() {
	    	  
	    	     System.out.println("This is lead method of pencil");
	      }
	      
	      public static void main(String[] args) {
			 
	    	//upcasting
	    	     Pen p1=new Pencil();
	    	     
	    	     p1.write();
	    	     p1.Ink();
	    	     
	    	     //downcasting
	    	     System.out.println("=============");
	    	     Pencil p2=(Pencil)p1;
	    	     
	    	     
	    	     p2.write();
	    	     p2.lead();
	    	     p2.Ink();
	    	 
	    	  
		}

}
