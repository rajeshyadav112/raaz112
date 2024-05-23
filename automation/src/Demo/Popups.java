package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(4000);
	
		   Robot bobo=new Robot();
		   bobo.keyPress(KeyEvent.VK_TAB);
		   Thread.sleep(4000);
		   bobo.keyPress(KeyEvent.VK_TAB);
		   Thread.sleep(4000);
		   bobo.keyPress(KeyEvent.VK_ENTER);
		   
		
	}

}
