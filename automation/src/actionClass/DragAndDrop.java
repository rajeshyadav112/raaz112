package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		
		WebElement button = driver.findElement(By.linkText("Sign In"));
		
		Actions action =new Actions(driver);
		action.keyDown(Keys.CONTROL).click(button).perform();
		action.keyUp(Keys.CONTROL).perform();
		action.click(button).perform();
		
	}
 
}
