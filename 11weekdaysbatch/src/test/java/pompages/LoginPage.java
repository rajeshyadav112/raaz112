package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	   WebDriver driver;
	   
	   public LoginPage( WebDriver driver) {
		
		   this.driver=driver;
	}
	
	  
	By username= By.name("username");
	By password=By.name("password");
	By loginbtn=By.xpath("//button[.=' Login ']");
	
	public void username(String user) {
		
		driver.findElement(username).sendKeys(user);
	}
	
	public void password(String pass) {
		
		 driver.findElement(password).sendKeys(pass);
	}
	
	public void clicOnLOginBtn() {
		
		driver.findElement(loginbtn).click();
	}
	
	
	
	
	
	
	
	

}
