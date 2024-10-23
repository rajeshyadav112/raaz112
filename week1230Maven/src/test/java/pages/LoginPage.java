package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 WebDriver driver;
	
	@FindBy(name="username")
	private	WebElement usertextbox;
	@FindBy(name="password")
	private	WebElement passfield;
	@FindBy(xpath="//button[.=' Login ']")
	private WebElement loginbuttion;
	
	   public LoginPage( WebDriver driver){
		   
		     this.driver=driver;

PageFactory.initElements(driver, this);
	   }
	
	public void enterusername(String user) {
		
		 usertextbox.sendKeys(user);
		  
	}
	
	public void enterpassowrd(String pass) {
		
		  passfield.sendKeys(pass);
	}
	
	public void clicklogin() {
		
		  loginbuttion.click();
	}
	
	
	  public void logintoapp( String user,String pass) {
		  
		     this.enterusername(user);
		     this.enterpassowrd(pass);
		     this.clicklogin();
		  
	  }
}
