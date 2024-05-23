package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFRAME {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame1);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("frame handling");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//option[text()='Big Baby Cat']")).click();
		
	
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		WebElement link = driver.findElement(By.linkText("Selenium [Python]"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		act.click(link).perform();
		
	}

}
