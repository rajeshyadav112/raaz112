package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.id("cars"));
		
		Select select= new Select(drop);
	System.out.println(	select.isMultiple());
	
	select.selectByIndex(0);
	Thread.sleep(3000);
	select.selectByVisibleText("Opel");
	Thread.sleep(2000);
	select.selectByValue("audi");
	
	// To deselect the selected option
	
	//select.deselectAll();
	select .selectByIndex(0);
	
	select.deselectByValue("Audi");
	
	//to get first selected option
	
WebElement first = select.getFirstSelectedOption();
    System.out.println(first.getText());
	
	// To print all the option in the dropdown

	List<WebElement> alloptions = select.getOptions();
	
	for(WebElement all:alloptions) {
		
		Thread.sleep(2000);
		System.out.println(all.getText());
		
		
		
	}
	

	}

}
