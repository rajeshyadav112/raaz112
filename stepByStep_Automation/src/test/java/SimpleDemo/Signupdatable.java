package SimpleDemo;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signupdatable {
	
	    WebDriver driver;

	    @Before
	    public void setup() {
	    	driver=new ChromeDriver();
	    	
	    }
	    @After
	    public void close() {
	    	driver.close();
	    	
	    }
	    @Given("The user is on the signup page")
	    public void the_user_is_on_the_signup_page() {
	    	//driver=new ChromeDriver();
	        // Navigate to the signup page
	        driver.get("https://automationexercise.com/signup");
	    }

	    @When("The user enters the following personal information")
	    public void the_user_enters_personal_information(io.cucumber.datatable.DataTable dataTable) {
	        // Convert the data table to a map for easier access
	        List<Map<String, String>> personalInfo = dataTable.asMaps(String.class, String.class);
	        for (Map<String, String> info : personalInfo) {
	            // Title selection
	            Select titleDropdown = new Select(driver.findElement(By.id("title")));
	            titleDropdown.selectByVisibleText(info.get("title"));

	            // Name input
	            driver.findElement(By.id("name")).sendKeys(info.get("name"));
	            driver.findElement(By.id("email")).sendKeys(info.get("email"));
	            driver.findElement(By.id("password")).sendKeys(info.get("password"));

	            // Date of birth selection
	            Select dayDropdown = new Select(driver.findElement(By.id("day")));
	            dayDropdown.selectByVisibleText(info.get("day"));

	            Select monthDropdown = new Select(driver.findElement(By.id("month")));
	            monthDropdown.selectByVisibleText(info.get("month"));

	            Select yearDropdown = new Select(driver.findElement(By.id("year")));
	            yearDropdown.selectByVisibleText(info.get("year"));
	        }
	    }

	    @When("selects {string}")
	    public void selects_newsletter_options(String option) {
	        // Handle checkbox selection based on the string value
	        WebElement checkbox;
	        if (option.equals("Sign up for our newsletter")) {
	            checkbox = driver.findElement(By.id("newsletter"));
	        } else if (option.equals("Receive special offers from our partners")) {
	            checkbox = driver.findElement(By.id("offers"));
	        } else {
	            throw new IllegalArgumentException("Unexpected option: " + option);
	        }
	        checkbox.click();
	    }

	    @When("enters the following address information")
	    public void enters_address_information(io.cucumber.datatable.DataTable dataTable) {
	        // Convert the data table to a map
	        List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
	        for (Map<String, String> info : addressInfo) {
	            // Filling out address fields
	            driver.findElement(By.id("first_name")).sendKeys(info.get("first_name"));
	            driver.findElement(By.id("last_name")).sendKeys(info.get("last_name"));
	            driver.findElement(By.id("company")).sendKeys(info.get("company"));
	            driver.findElement(By.id("address")).sendKeys(info.get("address"));
	            driver.findElement(By.id("address2")).sendKeys(info.get("address2"));
	            
	            // Selecting country, state, and filling city, zipcode, mobile
	            Select countryDropdown = new Select(driver.findElement(By.id("country")));
	            countryDropdown.selectByVisibleText(info.get("country"));

	            Select stateDropdown = new Select(driver.findElement(By.id("state")));
	            stateDropdown.selectByVisibleText(info.get("state"));

	            driver.findElement(By.id("city")).sendKeys(info.get("city"));
	            driver.findElement(By.id("zipcode")).sendKeys(info.get("zipcode"));
	            driver.findElement(By.id("mobile_no")).sendKeys(info.get("mobile_no"));
	        }
	    }

	    @When("clicks on the signup button")
	    public void clicks_on_the_signup_button() {
	        // Clicking the signup button
	        driver.findElement(By.id("signup_button")).click();
	    }

	    @Then("The user account should be created successfully")
	    public void the_user_account_should_be_created_successfully() {
	        // Verifying account creation
	        WebElement confirmationMessage = driver.findElement(By.id("confirmation_message"));
	        Assert.assertTrue(confirmationMessage.isDisplayed());
	        Assert.assertEquals("Your account has been created", confirmationMessage.getText());
	    }
	}


