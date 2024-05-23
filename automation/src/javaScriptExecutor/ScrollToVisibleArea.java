package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToVisibleArea {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		WebElement text = driver.findElement(By.xpath("//h4[text()='Selenium IDE']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(false)",text);
		
		//To scroll the webelement into visible area
		
		WebElement project = driver.findElement(By.xpath("//h2[text()='Support the Selenium Project']"));
		js.executeScript("arguments[0].scrollIntoView(true)", project);
	}

}
