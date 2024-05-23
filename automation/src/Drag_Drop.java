import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		
		WebElement destination = driver.findElement(By.id("trash"));
		
		action.dragAndDrop(source, destination).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Home")).click();
	}

}
