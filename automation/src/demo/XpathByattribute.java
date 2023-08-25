package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("rajboss@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Get Started'])[2]")).click();
		
	}

}
