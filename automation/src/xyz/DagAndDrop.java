package xyz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DagAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    
	System.out.println(    driver.getPageSource());
	
	Navigation nav = driver.navigate();
	
	     nav.back();
	     Thread.sleep(3000);
	     
	     nav.forward();
	     Thread.sleep(3000);
	     nav.refresh();
	     
	     nav.to("https://www.netflix.com/in/");
	     
	     driver.close();
	     
	     
	     
	
	
	
	    
	  
}
}
