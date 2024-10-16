package FlipkartProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import FlipkartProject.BookaProduct;
public class ProductDriver  {
	 WebDriver driver=null;
	@BeforeTest
	 public void setup() {
		 
		 driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
	 }
	
	@Test
	 public void book() {
		
		BookaProduct b= new BookaProduct(driver);
		b.search("iphone 14 plus");
		b.addToCart("110044");
	}

	
	}

