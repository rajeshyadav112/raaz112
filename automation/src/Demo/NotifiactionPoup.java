package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotifiactionPoup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Robot robo=new Robot();
		
		   robo.keyPress(KeyEvent.VK_TAB);
		   Thread.sleep(4000);
		   
		   robo.keyPress(KeyEvent.VK_ENTER);

	}

}
