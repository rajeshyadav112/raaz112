package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
         /*driver.get("https://www.google.com/");
         
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
       searchbox.sendKeys("paytm ddobraha");
        
        Thread.sleep(3000);
        
        searchbox.clear();
        searchbox.sendKeys("Toady paytm share price");
        
        searchbox.sendKeys(Keys.ENTER);
        */
       driver.get("https://blazedemo.com/");
       driver.findElement(By.partialLinkText("destination of")).click();
	}

}
