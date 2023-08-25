package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("(//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw=='])[1]"));
		driver.switchTo().frame(frame);   
		
WebElement source = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement destination = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[.='Free Ebooks'])[1]")).click();
	}
 
}
