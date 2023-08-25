package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		
		/*//alert
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//confirmation popup
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		*/
		
		//prompt Popup
		WebElement alert = driver.findElement(By.name("promptalertbox1234"));
		alert.click();
		 Alert swi = driver.switchTo().alert();
		 
		 swi.sendKeys("Yes");
		 
		 swi.accept();

	}

}
