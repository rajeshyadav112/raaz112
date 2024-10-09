package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver  driver=new ChromeDriver();
		   
		      driver.get("https://www.selenium.dev/downloads/");
		    
		   
		    Navigation nav = driver.navigate();
		   // Thread.sleep(4000);
		       //nav.back();
		      // Thread.sleep(4000);
		      // nav.forward();
		       //Thread.sleep(4000);
		      // nav.refresh();
		 
		Window win = driver.manage().window();
		
		win.maximize();
		    
		 win.fullscreen();
		 
		// to fetch the size of the window
		 
		Dimension s = win.getSize();
		
		System.out.println(s);
		
		System.out.println("The height of the window is:"+s.getHeight()+"pixel");
		
		System.out.println("The width of the window is:"+s.getWidth()+"pixel");
		
		// to set the size of the window
	   win.setSize(new Dimension(500,500));
	   
	 Point pos= win.getPosition();
	 
	 System.out.println(pos);
	 
	 System.out.println( pos.getX());
	 System.out.println( pos.getY());
	    
	   
	 // to set the position
	 
	 win.setPosition(new Point(500,300));
	   
		
	 nav.to("https://www.nykaa.com/");
	}

}
