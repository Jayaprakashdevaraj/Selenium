package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	public static void main(String[] args) {
		
		//WebDriverManager= dependancy used to download right version of browser driver automatically
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//load application url
		driver.get("http://leaftaps.com/opentaps/control/main");
			
		//maximize browse
		driver.manage().window().maximize();
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Companame");
		driver.findElementById("createLeadForm_firstName").sendKeys("Firstname");
		driver.findElementById("createLeadForm_lastName").sendKeys("Lastname");
		
		//Dropdown
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select s = new Select(Source);
		s.selectByVisibleText("Direct Mail");
		
		
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select s1 = new Select(marketingCampaign);
		s1.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select s2 = new Select(Industry);
		s2.selectByIndex(2);
		
		
		
		
		//driver.findElementByName("submitButton").click();
		
		
		
		
		
		}

}
