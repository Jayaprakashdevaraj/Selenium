package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOptions {

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
		
		// Pass the webelement to select class
		Select s = new Select(Source);
		
		//collection of items in dropdown
		List<WebElement> options = s.getOptions();
		
		//count of the items
		System.out.println(options.size());
		
		for(int i=1; i<options.size();i++) {
			WebElement eachElement = options.get(i);
			System.out.println(eachElement.getText());
			
		}
		
		
		
		
				
		
		
		
		
		}

}
