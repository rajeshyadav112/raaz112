package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TosearchInGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver  driver=new ChromeDriver();
		   
		      driver.manage().window().maximize();
		      driver.get("www.google.com/");
		   /*  
		    WebElement searchbox = driver.findElement(By.id("APjFqb"));
		    
		    searchbox.sendKeys("");
		    
		    Thread.sleep(3000);
		    searchbox.sendKeys(Keys.ENTER);
		    Thread.sleep(3000);
		    driver.findElement(By.id("dimg_7")).click();
		      
		     */
		      
		    WebElement link = driver.findElement(By.linkText("हिन्दी"));
		    
		 System.out.println("text=====:"+link.getText());
		 
		System.out.println("tagname==:"+link.getTagName());
		 link.click();

	}

}
