package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectTag {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu");
		WebElement drop = driver.findElement(By.xpath("//div[text()='Select Option']"));
		
		            Actions action = new Actions(driver);
		            action.sendKeys(drop,"Group 1,option 2").sendKeys(Keys.ENTER).perform();
	}

}
