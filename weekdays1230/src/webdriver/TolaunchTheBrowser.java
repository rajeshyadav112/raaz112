package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TolaunchTheBrowser {

	public static void main(String[] args) {
	// to launch the empty browser
		WebDriver   driver =new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println("The title of the selenium is :"+driver.getTitle());
		
		// To fetch the url of the website
		System.out.println("The url of the flipkart is :"+driver.getCurrentUrl());
		
		// To fetch the source code
	//System.out.println(driver.getPageSource());
		
		// To nfetch the window id
		System.out.println("The window id is :"+driver.getWindowHandle());
		
		
		
		//driver.close();
		driver.quit();
	
		
	}

}
