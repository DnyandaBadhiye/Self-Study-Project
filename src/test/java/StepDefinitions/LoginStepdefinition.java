package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepdefinition {
 WebDriver driver;
	
	@Given("^When User is on Login Page$")
	public void when_User_is_on_Login_Page() {
	System.setProperty("webdriver.chrome.driver","C:/Selenium software/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost:100");
	   
	}

	@When("^Title of app is vTiger$")
	public void title_of_app_is_vTiger() {
	   
	}

	@Then("User Enters Username and Password")
	public void user_Enters_Username_and_Password() {
	    
	}

	@And("Click on Login button")
	public void click_on_Login_button() {
	    
	}

	@Then("User goes on main page")
	public void user_goes_on_main_page() {
	    
	}


	
	}

