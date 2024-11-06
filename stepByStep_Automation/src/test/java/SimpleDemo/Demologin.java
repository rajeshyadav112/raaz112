package SimpleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demologin {
	
WebDriver driver;
	

	@Test(dataProvider="data")
	public void loginCredentials(String username,String password) throws InterruptedException {
		   driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			  Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@class=\"oxd-userdropdown-img\"]")).click();
	    Thread.sleep(4000);
		
	}
	   @DataProvider(name="data")
	    public Object [][] data(){
	    	
	    	
	    	return new Object [][] {
	    		
	    		{"Admin","admin123"},
	    		{"radhe","shyam"},
	    		{"radhe","ram"}
	    			
	    		
	    	    
	    };
	    }
}


