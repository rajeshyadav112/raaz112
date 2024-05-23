package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Isselect_IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		Thread.sleep(4000);
	  WebElement checkbox= driver.findElement(By.name("nseAccept"));
	  
	    checkbox.click();
	  
	    
	    
	    
	}

}
