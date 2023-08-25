package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvid {
	
	
		
		 WebDriver driver = null;
		
	
		@Test(dataProvider ="getdata" )
		
		public void Login(String username, String password) throws InterruptedException {
			driver = new EdgeDriver();
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Browser is launched");
			driver.manage().window().maximize();
			
			 WebElement text = driver.findElement(By.id("username"));
					text.sendKeys(username);
			WebElement pass = driver.findElement(By.name("pwd"));
			pass.sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);
			
			
	String expected ="actiTIME - Enter Time-Track";
    String Actual = driver.getTitle();
			
			
     Assert.assertEquals(expected,Actual);
		
			
		
		}
		
		@DataProvider(name="getdata")
		@Test(groups="functional")
		public Object[][] getdata(){
			
			return new Object [][]  {
					{"admin", "manager"},
					{"raaz","admin"},
					{"trainee","raaz"}
			};
			
			
			}
		}
	


