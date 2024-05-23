package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Login2 {
	
	    WebDriver driver;
	    
	        WebDriverWait wait;
	  @BeforeClass(groups="functional") 
	  @Parameters("browser")
	  public void browserlauch(String browser) throws InterruptedException {
		  if(browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(4000);
		  
	  }
		  else if(browser.equalsIgnoreCase("edge")) {
			  
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  Thread.sleep(4000);
		  }
	  }
	  
	  @BeforeMethod(groups="functional")
	  public void loginCredential() {
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  
		  
	  }
      @Test(groups="functional")
	  public void click_on_Login_Button() {
		 
    	  driver.findElement(By.tagName("button")).click();
		  
		  
	  }
	  
	  @AfterMethod(groups="smoke")
	public void  logout() throws InterruptedException {
		
		      wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		      
		WebElement drop = driver.findElement(By.xpath("//img[@alt=\"profile picture\"]"));
		
		wait.until(ExpectedConditions.visibilityOf(drop));
		
		drop.click();
		
		
	
}
}
	  

