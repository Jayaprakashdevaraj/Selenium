package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSDropdown {
	
	public static void main(String[] args) {
		
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
		
		
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select s = new Select(Source);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(options.get(size-2).getText());
		
		
		WebElement marketingCampaign = driver.findElementById("marketingCampaignId");
		Select s4 = new Select(marketingCampaign);
		s4.selectByIndex(2);
		System.out.println();
		
		
	}

}
