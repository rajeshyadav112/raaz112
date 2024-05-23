package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		 
		 Actions act =new Actions(driver);
		 act.moveByOffset(200, 100).doubleClick().perform();
		 //act.moveByOffset(200, 100).contextClick().perform();
		 
		
	}

}
