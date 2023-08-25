package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run {
	
	WebDriver driver=null;
	@BeforeClass(groups="smoke")
	public void browserSetup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(3000);
		
	}
	
	@Test(groups="smoke")
	public void login() {
		
driver.findElement(By.name("email")).sendKeys("rajeshyadav14112@gmail.com");
		System.out.println("logged in");
	}
@AfterMethod(groups="functional")
	public void logout() {
		
	driver.quit();
		System.out.println("logged out");
		
	}
       @Test(groups="regression")
        public void close() {
        	System.out.print("closed");
        }
}
