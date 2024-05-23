package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		   
		/*driver.findElement(By.xpath("//button[contains(text(),'click the button to')]")).click();
		
	     Thread.sleep(4000);
	     
	     driver.switchTo().alert().accept();
	      */
		// confirmation popup
      driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
      
      driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
      
      Thread.sleep(4000);
      driver.switchTo().alert().dismiss();
      
      //prompt popup
      driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	   Alert alert = driver.switchTo().alert();
	   
	       alert.sendKeys("raaz");
	       alert.accept();
	}

}
