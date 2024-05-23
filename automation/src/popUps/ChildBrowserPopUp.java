package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		
	Set<String> all = driver.getWindowHandles();
		
		for(String id:all) {
			
			if(!id.equals(parent)) {
				
				//driver.switchTo().window(id);
					
				
			}
		}
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("robinhood");
		//driver.close();
		

	}

}
