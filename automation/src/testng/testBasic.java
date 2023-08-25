package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testBasic {
	
	
	@Test(groups="smoke")
	public static void runtest() {
		System.out.println("run method is successfully executed");
	}
	@Test(groups="functional")
	public static void browserLaunchtest() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
	@Test(groups="functional")	
	
	public static  void demo() {
		
		System.out.println("demo method ");
		
	}
	

}
