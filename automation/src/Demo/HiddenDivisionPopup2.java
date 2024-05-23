package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
     driver.findElement(By.xpath("//span[text()='Login']")).click();
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//span[text()='✕']")).click();
	}

}
