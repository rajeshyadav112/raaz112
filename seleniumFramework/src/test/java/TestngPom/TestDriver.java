package TestngPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDriver {

	 WebDriver driver;
	 
	  
	  LoginPage l;
	  HomePage h;
	  @BeforeTest
	  public void setup() {
		  
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  }

	  @Test(priority=0)
	  public void verify_homePage() {
		  
		  LoginPage l=new LoginPage(driver);
		  
		 l.logintoapp("Admin", "admin123");
		  
		  HomePage h=new HomePage(driver);
		  h.logout();
	  }
	 
	  

}
