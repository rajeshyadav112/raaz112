package TestngPom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	
	   WebDriver driver;
	   
 public LoginPage(WebDriver driver){
		   
		      this.driver=driver;
		      PageFactory.initElements(driver, this);
	   }
	   
	   @FindBy(name="username")
	   private WebElement usernamefield;
	   
	   @FindBy(name="password")
	   private WebElement passwordfield;
	   @FindBy(xpath = "//button[.=' Login ']")
	   private  WebElement loginbutton;
	  
	   public void username(String username) {
		   
		     usernamefield.sendKeys(username);
	   }
	   public void password(String password) {
		   
		   passwordfield.sendKeys(password);
	   }
	   
	   public void button() {
		   
		   loginbutton.click();
	   }
     public void logintoapp(String user,String pass) {
    	 
    	 this.username(user);
    	 this.password(pass);
    	 this.button();
     }
}
