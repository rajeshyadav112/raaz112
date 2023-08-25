package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameClassname {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement text = driver.findElement(By.className("textField"));
		text.sendKeys("admin");
		Thread.sleep(2000);
		text.clear();
		WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(check.getTagName());
		check.click();
		System.out.println(check.isSelected());
		
		
		driver.findElement(By.className("textField")).sendKeys("MnGER");
		
       WebElement button = driver.findElement(By.id("loginButton"));
       System.out.println(button.getText());
	}

}
