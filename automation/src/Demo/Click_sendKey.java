package Demo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_sendKey {

	
	public static void main(String[] args) throws InterruptedException {
		     
		     
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(4000);
			
			WebElement search = driver.findElement(By.id("APjFqb"));
			
			search.sendKeys("ram mandir ayodhya");
			Thread.sleep(4000);
			
		          
		
			List<WebElement> textlist = driver.findElements(By.tagName("ul"));
			Thread.sleep(4000);
			System.out.println(  textlist.size());
			
			for(WebElement  x:textlist) {
				
				   System.out.println( x.getText());
				   
				  
					   
			}
	}
	
	
}


