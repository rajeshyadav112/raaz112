package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBycontains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			driver .get("https://github.com/signup?");
			
			Thread.sleep(4000);
			WebElement field = driver.findElement(By.id("email"));
			field.sendKeys("raj123");
			field.clear();
			field.sendKeys("jonny");

	}

}
