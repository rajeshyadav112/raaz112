package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver=null;
	
	@Test(dataProvider="getdata")
	public void loginTest(String username,String password) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
	
	}
	@org.testng.annotations.DataProvider(name="getdata")
	public  Object [][] getdata() {
	
		    	return new  Object  [][] {
		    			
		    		{"admin","manager"},
		    		{"raaz","yadav"},
		    		{"yadav","raaz"},
		    		{"",""}
		    			
		    		};
		
		
	}

}
