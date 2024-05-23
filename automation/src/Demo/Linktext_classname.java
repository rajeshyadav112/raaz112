package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_classname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
         driver.get("https://www.myntra.com/");
         
          WebElement womenlink = driver.findElement(By.linkText("Women"));
          
          System.out.println( womenlink.getText());
          System.out.println(womenlink.getTagName());
          
     System.out.println(womenlink.isEnabled());
     System.out.println( womenlink.isDisplayed());
     System.out.println(womenlink.isSelected());
         // womenlink.click();
     
          WebElement profile = driver.findElement(By.className("desktop-userTitle"));
       System.out.println(   profile.getSize());
       System.out.println(  profile.getLocation());
          
     
      WebElement search = driver.findElement(By.tagName("input"));
      search.sendKeys("shoes");
      Thread.sleep(3000);
     
      search.sendKeys("pants");
      
     
          
         
}
}
