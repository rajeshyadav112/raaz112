package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		WebElement box = driver.findElement(By.id("box"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(box).doubleClick().perform();
	}

}
