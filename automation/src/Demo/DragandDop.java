package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDop {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		 
		 WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		 
		 driver.switchTo().frame(frame);
		 
		 WebElement source = driver.findElement(By.xpath("//img[@alt=\"The chalet at the Green mountain lake\"]"));
		 
		 WebElement destination = driver.findElement(By.id("trash"));
		 Actions act =new Actions(driver);
		 
		 act.dragAndDrop(source, destination).perform();
		 Thread.sleep(5000);
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
		 
		 
		 

	}

}
