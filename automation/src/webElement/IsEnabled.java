package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
    driver.findElement(By.id("email")).sendKeys("boss.raj00001@gmail.com");
		
    
     WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
     Thread.sleep(2000);
    System.out.println( button.isEnabled());
   System.out.println( button.isDisplayed());
   
   Rectangle rect = button.getRect();
   
   System.out.println(rect.getHeight());
   System.out.println( rect.getWidth());
   System.out.println(rect.getX());
   System.out.println( rect.getY());
   Point loc = button.getLocation();
   
   System.out.println(button.getAttribute("type"));
   System.out.println( button.getCssValue("background-attachment"));
      
	}

}
