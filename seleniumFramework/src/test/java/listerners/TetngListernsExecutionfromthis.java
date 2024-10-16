package listerners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerners.TestNgListerners.class)
public class TetngListernsExecutionfromthis {
@Test
	  public void test1() {
		  
		 System.out.println("im inside test1"); 
		  
	  }
@Test
 public void test2() {
		  
	 System.out.println("im inside test2");  
		  
	   }
@Test
 public void test3() {
	  
	 System.out.println("im inside test3"); 
	  
 }
@Test
 public void test4() {
	  
	 System.out.println("im inside test4");  
	  
 }

}
