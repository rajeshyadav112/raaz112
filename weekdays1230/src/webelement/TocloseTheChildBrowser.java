package webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocloseTheChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			driver .get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(4000);
		
			String parentid = driver.getWindowHandle();
		driver.findElement(By.cssSelector("a[href=\"https://www.facebook.com/automationtesting2016/\"]")).click();
		
		Set<String> allid = driver.getWindowHandles();
		
		  for(String ids:allid) {
			  
			    
			  if(!ids.equalsIgnoreCase(parentid)) {
				  
				    driver.switchTo().window(ids);
				    
				    Thread.sleep(3000);
				    driver.close();
			  }
		  }
		
		
	}

}
 