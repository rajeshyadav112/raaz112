package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drop = driver.findElement(By.tagName("select"));
		
		Select select =new Select(drop);
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("ASM");
		Thread.sleep(3000);
		select.selectByVisibleText("Bahrain");
		
		//select.deselectByIndex(0);
		//select.deselectByValue("ASM");
		//select.deselectByVisibleText("Bahrain");
		
		//select.deselectAll();
		//System.out.println(select.getFirstSelectedOption());
		
		

	}

}
