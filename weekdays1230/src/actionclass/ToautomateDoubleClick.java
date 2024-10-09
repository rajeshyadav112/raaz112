package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToautomateDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		// WebElement box = driver.findElement(By.id("box"));
		
		Actions act = new Actions(driver);
		  
		  
		//act.doubleClick(box).perform();
		
		  //Thread.sleep(4000);
		
		 // box.click();
		
		
		  // to drag and drop 
		  /*
		  WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		  
		     driver.switchTo().frame(frame);
		     
		   WebElement source = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));

		     WebElement destination = driver.findElement(By.id("trash"));
		     
		     act.dragAndDrop(source, destination).perform();
		     
		     driver.switchTo().defaultContent();
		     
		    */ Thread.sleep(4000);
		    WebElement t = driver.findElement(By.xpath("//a[text()='CheatSheets']"));
		    		t.getText();
		    System.out.println(t);
		     
		   act.keyDown(Keys.CONTROL).perform();
		   
		   t.click();
		   
		   
		     
	}

}
