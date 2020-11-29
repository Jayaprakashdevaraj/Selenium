package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {


	/*
	 * @Given("Launch the chrome Browser") public void openChromeBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 * 
	 * @Given("Load the application URL") public void loadURL() {
	 * driver.get("http://leaftaps.com/opentaps/"); }
	 */

	@Given("Enter the username as (.*)")
	public void enterUsername(String usename) {
		driver.findElementById("username").sendKeys(usename);
	}

	@Given("Enter the password as (.*)")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
	}

	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Homepage should be display")
	public void verifyHomePage() {
		System.out.println("Homaepage appeared");
	}

	@But("Error message should be display")
	public void ErrorMsg() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Homaepage not appeared");
	}

}
