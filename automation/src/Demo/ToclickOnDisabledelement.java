package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToclickOnDisabledelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk21-windows");
		
		
		driver.findElement(By.linkText("jdk-8u391-linux-i586.rpm")).click();
		
		Thread.sleep(4000);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Download jdk-8u391-linux-i586.rpm']"));
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", link);

	}

}
