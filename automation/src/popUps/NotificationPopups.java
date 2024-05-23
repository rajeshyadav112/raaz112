package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NotificationPopups {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gclid=CjwKCAjwrranBhAEEiwAzbhNtcrrasa_pp1MAbidTQPCaY9pgezOBZ63tVlIBgYvsMei9AZkLdxtGBoCW70QAvD_BwE");
		Thread.sleep(6000);
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}	

