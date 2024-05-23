package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Login {
	WebDriver driver;
	
	@BeforeTest(groups="smoke")
	@Parameters("browser")
	public void setup(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
		   driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		  Thread.sleep(3000);
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			  Thread.sleep(3000);
			
		}
	}
	
	@Test(groups="smoke")
	public void loginCredentials() throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(4000);
		
	}
	
	@AfterTest(groups="functional")
	public void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@class=\"oxd-userdropdown-img\"]")).click();
	    Thread.sleep(4000);
		
	}

}
