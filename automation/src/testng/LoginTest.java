package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver=null;
	
	@BeforeClass()
	public void browserlaunch() {
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
			
		System.out.println("browser is launched");
	}
@Test()
	public void loginCredential() {
	   driver.findElement(By.id("email")).sendKeys("rajeshyadav14112@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("raaa888888");
}
       @AfterMethod  
	public void logIn() {
		
	driver.findElement(By.xpath("//button[.='Log in']")).click();
		System.out.println("logged in");
		
	}
}

	
