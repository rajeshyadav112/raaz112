package testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgGroupexecution {

	 WebDriver driver;
	   @BeforeClass(groups="smoke")
	  public void setup() {
		  
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://automationexercise.com/login");
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
	  }
	   @Test(groups = "smoke" ,priority = 1)
   public void FullName() {
		   
	   driver.findElement(By.name("name")).sendKeys("rajesh yadav");
	   
		  
	  }

	   @Test(groups = "smoke" ,priority  =2)
   public void EnterEmail() {
	  driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("rajeshyadav14112@gmail.com");
	   
 }
	   @Test(groups = "Regression" ,priority =3)
  public void click_On_signup_button() {
	  
  	driver.findElement(By.xpath("//button[.='Signup']")).click();
	  
}  @AfterClass (groups = "sanity")
  public void teardown() {
  	
  	driver.close();
  }
}
