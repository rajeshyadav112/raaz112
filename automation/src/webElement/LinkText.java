package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		//driver.findElement(By.partialLinkText("actiTIME")).click();
		
		driver.findElement(By.cssSelector("a[id='toPasswordRecoveryPageLink']")).click();
		

	}

}
