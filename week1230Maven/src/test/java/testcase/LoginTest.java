package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest  {
	
	static  WebDriver driver;
	 
	 LoginPage l;
	 HomePage home;
      
       @Test
       public void testexecution() throws InterruptedException {
    	   
    	       driver=new ChromeDriver();
    	       driver.manage().window().maximize();
    	       driver.get("//opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	      
    	       LoginPage l=new LoginPage(driver);
    	      
    	       l.logintoapp("Admin", "admin123");
    	       
    	       home=new HomePage(driver);
    	       
    	       Thread.sleep(4000);
    	       home.logoutfromapp();
    	      
    	       
       }
       
       @AfterClass
       public void teardown() {
    	   
    	   //driver.close();
    	   driver.quit();
       }
}
