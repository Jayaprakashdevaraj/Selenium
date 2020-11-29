package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadByUsingXpath {

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
		
		
		driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		
		
	
		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Companame");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Firstname");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Lastname");
		
				
		//Dropdown
		WebElement Source = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select s = new Select(Source);
		s.selectByVisibleText("Direct Mail");
		
		
		WebElement marketingCampaign = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select s1 = new Select(marketingCampaign);
		s1.selectByValue("CATRQ_AUTOMOBILE");
		

		WebElement ownership = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select s2 = new Select(ownership);
		s2.selectByIndex(2);

		driver.findElementByXPath("//input[@type='submit']").click();
		
		System.out.println(driver.getTitle());
		
		
		
		}

}
