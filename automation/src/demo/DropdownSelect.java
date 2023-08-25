package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chrome.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement list = driver.findElement(By.tagName("select"));
		
		
		Select select=new Select(list);
		System.out.println(select.isMultiple());
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Afghanistan");
		Thread.sleep(2000);
		select.selectByValue("ARG");
		
		
		
	}
	

}
