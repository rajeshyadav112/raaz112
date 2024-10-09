package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementExamples {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver   driver=new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.myntra.com/");
		 Thread.sleep(4000);
		 
		 WebElement search = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		 
		 
	System.out.println( search.isDisplayed());
		System.out.println( search.isEnabled());
		System.out.println( search.isSelected());
		
		 search.sendKeys("toy");
		 
		// driver.findElement(By.xpath("//span[@data-reactid=\"909\"]")).click();
		 
		 
		WebElement pro = driver.findElement(By.xpath("//span[text()='Profile']"));
		
		System.out.println("The text of the profile is :"+pro.getText());
		 
		 
		 
		
		

	}

}
