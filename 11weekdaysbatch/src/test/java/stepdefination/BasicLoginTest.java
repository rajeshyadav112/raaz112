package stepdefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pompages.HomePage;
import pompages.LoginPage;

public class BasicLoginTest {

	  //LoginPage lPage;
	 // HomePage hpage;
	private  WebDriver driver;
	@Before
	public void setup() {

		this.driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


	@After
	public void teardown() {

		driver.quit();

	}

	@Given("user is on the loginpage")
	public void user_is_on_the_loginpage() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

	@When("user enter the valid username and valid password")
	public void user_enter_the_valid_username_and_valid_password() {

		 // lPage=new LoginPage(driver);
		 // lPage.username("admin");
		//  lPage.password("admin123");
		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@And("click on login button")
	public void click_on_login_button() {

		// lPage.clicOnLOginBtn();
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}

	@Then("user should be successfully logged in to the application")
	public void user_should_be_successfully_logged_in_to_the_application() {

		// hpage=new HomePage(driver);
		// hpage.Text();
		WebElement text = driver.findElement(By.xpath("//span[.='Admin']"));
		String expected = "Admin";
		String actual = text.getText();
		assertTrue(actual.contains(expected));
		System.out.println("This login validation method");
	}
		@And("wait for logout")
		public void	wait_for_logout() {
			
			System.out.println("890-=");
			
		}
			
		
	

	@When("user click on profile")
	public void user_click_on_profile() throws InterruptedException {

		System.out.println("this is the profile method");

		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();

		Thread.sleep(3000);
	}

	@When("click on logout")
	public void click_on_logout() {
		System.out.println("im inside logout");
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

	@Then("user should be successfully logged out")
	public void user_should_be_successfully_logged_out() {

		System.out.println("=======");
	}


}
