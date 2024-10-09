package webdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

public class TolaunchTheEmptyBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver   driver=new EdgeDriver();
		 
		 driver.get("https://www.selenium.dev/downloads/");
		
		System.out.println("The title of the webpage is :"+ driver.getTitle());

		System.out.println("The url of the web is :"+  driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println("The window id is "+driver.getWindowHandle());
		
		
		/*Navigation nav = driver.navigate();
		Thread.sleep(4000);
		nav.back();
		Thread.sleep(4000);
		nav.forward();
		Thread.sleep(4000);
		nav.refresh();
		*/
	Window win = driver.manage().window();
	
	win.maximize();
	
	//win.fullscreen();
	
	System.out.println("The height and width of the window is"+win.getSize());
	
	System.out.println("The height of the window is :"+win.getSize().getHeight());
	
	System.out.println("The width of the window is :"+win.getSize().getWidth());
	
	win.setSize(new Dimension(100,200));
	
	System.out.println( win.getPosition()); 
	
	System.out.println("The x of the window is "+  win.getPosition().getX());
	   
	System.out.println("The y of the window :"    +win.getPosition().getY());
	   
	
	    win.setPosition(new Point(500,200));
		//driver.close();
		
		//driver.quit();
	}

}
