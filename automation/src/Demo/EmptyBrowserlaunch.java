package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowserlaunch {

	public static void main(String[] args) {
		
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	 System.out.println(	"The title of flipkart is :"+driver.getTitle());
	
     System.out.println(	"The url is :"+driver.getCurrentUrl());

     //System.out.println( driver.getPageSource());
     
    
		
      System.out.println("The window id is :"+ driver.getWindowHandle());
      
         
      
      driver.quit();
	}

}
