package FlipkartProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BookaProduct {

	  WebDriver driver=null;
	By search=By.name("q");
	
	By  model =By.xpath("'//div[text()='APPLE iPhone 14 Plus (Blue, 128 GB)']'");
	 By rom = By.linkText("256 GB");
	 By pincode = By.id("pincodeInputId");
	By check = By.xpath("//span[text()='Check']");
	By addTocart= By.xpath("//span[text()='Add 3 Items to Cart']");
	
	BookaProduct(WebDriver driver){
		this.driver=driver;
		
	}
	public void search(String product) {
		
		driver.findElement(search).sendKeys(product);
		driver.findElement(search).sendKeys(Keys.ENTER);
		driver.findElement(model).click();
		driver.findElement(rom).click();
	}
	public void addToCart(String code) {
		driver.findElement(pincode).sendKeys(code);
		driver.findElement(check).click();
		driver.findElement(addTocart).click();
	}
}
	
	
