package week2.day1.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Account Name");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		driver.findElementById("groupNameLocal").sendKeys("Local Name");
		driver.findElementById("officeSiteName").sendKeys("Site Name");
		driver.findElementByName("annualRevenue").sendKeys("123456789");
		
		
		WebElement Industry = driver.findElementByName("industryEnumId");
		Select s1 = new Select(Industry);
		s1.selectByIndex(2);
		
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select s2 = new Select(ownership);
		s2.selectByVisibleText("S-Corporation");
		
		
		WebElement Source = driver.findElementById("dataSourceId");
		Select s3 = new Select(Source);
		s3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElementById("marketingCampaignId");
		Select s4 = new Select(marketingCampaign);
		s4.selectByIndex(6);
		
		WebElement stateProvider = driver.findElementById("generalStateProvinceGeoId");
		Select s5 = new Select(stateProvider);
		s5.selectByValue("TX");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
	}

}
