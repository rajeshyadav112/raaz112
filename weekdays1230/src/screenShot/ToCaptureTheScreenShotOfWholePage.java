package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToCaptureTheScreenShotOfWholePage {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		  
		    TakesScreenshot tS=(TakesScreenshot)driver;
		   WebElement button= driver.findElement(By.linkText("View Source"));
		   File source = button.getScreenshotAs(OutputType.FILE);
		   
		   File dest=new File("./Screenshot/Tushar.png");
		   
		   Files.copy(source, dest);
		   
		   

	}

}
