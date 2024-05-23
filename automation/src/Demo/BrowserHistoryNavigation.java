package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Navigation nav = driver.navigate();
		
		    nav.back();
		    
		    Thread.sleep(3000);
		    
		    nav.forward();
		    Thread.sleep(3000);
		    nav.refresh();

		    nav.to("https://google.com/");
	}

}
