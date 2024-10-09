package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	  WebDriver driver;
	  
	  public HomePage(WebDriver driver) {
		
		  this.driver=driver;
	}
	  
	 
	By admin = By.xpath("//span[.='Admin']");
	
	public void Text() {
		
		String  t=driver.findElement(admin).getText();
		
		System.out.println(t);
	}
	  
}
