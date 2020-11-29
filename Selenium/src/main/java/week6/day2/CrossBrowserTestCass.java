package week6.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestCass {

	public RemoteWebDriver driver;

	@Parameters({"browser"})
	@Test
	public void createLead(String browserValue) {
	
	if(browserValue.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}else if(browserValue.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	
	}else if(browserValue.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("Exela");
	driver.findElementById("createLeadForm_firstName").sendKeys("Jayaprakash");
	driver.findElementById("createLeadForm_lastName").sendKeys("Devaraj");
	driver.findElementByName("submitButton").click();

	}
}
