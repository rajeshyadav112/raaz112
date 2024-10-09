package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class  SingleElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
		TakesScreenshot shot =(TakesScreenshot)driver;
		File source = profile.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshot/profile.png");
		Files.copy(source, destination);
		
		

	}

}
