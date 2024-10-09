package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToperformTheActionBypartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			driver .get("https://www.myntra.com/");
			
			// to fins the loc and size of the search bar with the help of getrect()
			WebElement search = driver.findElement(By.tagName("input"));
			
			Rectangle rec = search.getRect();
			
			Dimension size = rec.getDimension();
			
			   System.out.println(size);
			   
			 System.out.println("This is the height of the box:"+ size.getHeight());
			 System.out.println("This the width of the box:"+  size.getWidth());
			Point loc = rec.getPoint();
		
	            System.out.println(loc);
	            
	         System.out.println("This is the x distance of box:"+loc.getX());
	            
	         System.out.println("This is the y distance of box:"+  loc.getY());
	             
	}

}
