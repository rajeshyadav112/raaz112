package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-webdriver/find-broken-links-in-selenium/");

		WebElement button = driver.findElement(By.xpath("//span[.='Tutorials']"));
		Actions action = new Actions(driver);
		
		action.contextClick(button).perform();
	} 

}
