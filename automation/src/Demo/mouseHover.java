package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.howtocodeschool.com/2021/10/demo-of-simple-click-and-hold-effect.html");
		
		
		
		Actions act=new Actions(driver);
		
		
		
		
		
		WebElement clikHold = driver.findElement(By.id("btn"));
		
		  act.clickAndHold(clikHold).perform();
		  
		  Thread.sleep(5000);
		  
		  act.release(clikHold).perform();
		
		}
		
	
	
	

	}


