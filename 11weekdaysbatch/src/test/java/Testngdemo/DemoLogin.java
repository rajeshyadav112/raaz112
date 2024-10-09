package Testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DemoLogin {

	  WebDriver driver;
	
	  
	  @Test(groups ="smoke" ,priority = 0)
	   @Parameters("browser")
	  public void setup(String browser) {
		 
		  if(browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
	  }
		  
		  else if(browser.equalsIgnoreCase("edge")) {
			  
			  driver=new EdgeDriver();
			  
			  driver.manage().window().maximize();
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  
			  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			  
			  
		  }
	  }
	  
	  @Test(groups="smoke",priority = 1)
	  public void logindata() {
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  
		  
	  }
	  
	  
	  @Test(groups="functional",priority = 2)
	  public void click_on_Login_Button() {
		 
		  driver.findElement(By.xpath("//button[.=' Login ']")).click();
		  
		
	}
	  
	  @Test(groups="functional",priority= 3)
	  public void teardown() {
		 
		  driver.close();
		  
		  
	  }
	
}
