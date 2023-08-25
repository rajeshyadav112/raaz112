package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	 WebElement drop = driver.findElement(By.id("cars"));
		
		Select select =new Select(drop);
		
		System.out.println( select.isMultiple());
		select.selectByIndex(0);
		select.selectByVisibleText("Opel");
		select.selectByValue("audi");
		
		
		List<WebElement> option = select.getAllSelectedOptions();
		
		for(WebElement op:option) {
			
			System.out.println(op.getText());
		}
		
		  WebElement option2 = select.getFirstSelectedOption();
		  System.out.println(option2.getText());
		  
		  
		 select.deselectAll();
		  //select.deselectByIndex(0);
		 // select.deselectByValue("audi");
		  //select.deselectByVisibleText("Opel");

	}

}
