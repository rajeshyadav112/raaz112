package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
   
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		 
		 WebElement button = driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]"));
		 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement field = driver.findElement(By.id("email"));
         wait.until(ExpectedConditions.visibilityOf(field));
         
         field.sendKeys("rajewshy@gmail.conm");
         
         wait.until(ExpectedConditions.elementToBeClickable(button));
         button.click();
         
	}

}
