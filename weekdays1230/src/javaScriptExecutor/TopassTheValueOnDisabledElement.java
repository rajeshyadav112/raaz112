package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopassTheValueOnDisabledElement {
	public static void main(String[] args) {
		
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		  
		 WebElement text = driver.findElement(By.linkText("Home"));
		 
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].click()", text);
	}

}