package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetrectByXpath {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(4000);
		  
		  WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		  
		      
		 Rectangle rect = button.getRect();
		 
		System.out.println( rect.getHeight());
	System.out.println(	 rect.getWidth());
	System.out.println(	 rect.getX());
	System.out.println(	 rect.getY());
	
	  System.out.println(  button.getAttribute("type"));
	  
	System.out.println( button.getCssValue("height"));
	System.out.println( button.getCssValue("background-color"));
	
	//xpath by text function
	  driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
	}

}
