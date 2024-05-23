package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.howtocodeschool.com/2021/10/demo-of-simple-click-and-hold-effect.html");
		 
		 Thread.sleep(4000);
		 Actions act =new Actions(driver);
		 
		WebElement button = driver.findElement(By.id("btn"));
		 //By offset
		// act.moveByOffset(142, 289).clickAndHold().perform();
		 
		act.clickAndHold(button).perform();
		Thread.sleep(4000);
		 act.release(button).perform();
	}

}
