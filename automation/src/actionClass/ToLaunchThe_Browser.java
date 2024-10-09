package actionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchThe_Browser {

	
	  
	public static void main(String[] args) {
		
		WebDriver  driver = new EdgeDriver();
     
		  driver.get("https://www.selenium.dev/");
		  
		 System.out.println("The title of the  selenium is :"+ driver.getTitle());
		 
		 
	}

}
