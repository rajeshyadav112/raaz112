package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Click_OnDisabled_Element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[.=\"jdk-8u401-linux-aarch64.tar.gz\"]")).click();
		
		WebElement disabled = driver.findElement(By.xpath("//a[@class=\"download-file icn-lock\"]"));
		   
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].click()", disabled);
          
		  driver.navigate().to("https://demoapp.skillrary.com/");
		  
		  
		  WebElement disabledfield = driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
		  
		 
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].value='yadav'", disabledfield);
		  js.executeScript("window.scrollBy(0,600)");
		  
		  //to scroll bottom at end
		  js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)", args);
	}

}
