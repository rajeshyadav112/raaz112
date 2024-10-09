package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			driver .get("https://www.myntra.com/");
			Thread.sleep(4000);
		
		WebElement searchbox = driver.findElement(By.xpath("//span[text()='Bag']"));

		 // searchbox.sendKeys("T-shirts");
		  
		    //searchbox.sendKeys(Keys.ENTER);
		 // driver.findElement(By.xpath("//span[@data-reactid=\"909\"]")).click();
		  
		  
		searchbox.click();
	}

}
