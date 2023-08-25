package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("//span[text()='Admin']"));
		Actions action = new Actions(driver);
		 action.keyDown(Keys.CONTROL).perform();
		 action.click(button).perform();
		 action.keyUp(Keys.CONTROL).perform();
		 
		 
		 
		
		
	}

}
