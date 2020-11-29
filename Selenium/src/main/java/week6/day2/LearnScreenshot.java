package week6.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenshot {

	@Test
	public class CrossBrowserTestCass {

		public ChromeDriver driver;

		
		@Test
		public void createLead() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//take screenshot	
		File source = driver.getScreenshotAs(OutputType.FILE);
	
	//create the target	
		File target = new File("./snaps/leaftabs.png");
		
	//Paste the screenshot to target location	
		FileUtils.copyFile(source, target);
		
	// for getting screenshot for single webelement	
		  WebElement username = driver.findElementById("username");
			File source1 = username.getScreenshotAs(OutputType.FILE);
			File usernamefield = new File("./snaps/leaftabs2.png");
			FileUtils.copyFile(source1 , usernamefield);
			
			
			
			/*

			 * driver.findElementById("password").sendKeys("crmsfa");
			 * driver.findElementByClassName("decorativeSubmit").click();
			 * driver.findElementByLinkText("CRM/SFA").click();
			 * driver.findElementByLinkText("Leads").click();
			 * driver.findElementByLinkText("Create Lead").click();
			 * driver.findElementById("createLeadForm_companyName").sendKeys("Exela");
			 * driver.findElementById("createLeadForm_firstName").sendKeys("Jayaprakash");
			 * driver.findElementById("createLeadForm_lastName").sendKeys("Devaraj");
			 * driver.findElementByName("submitButton").click();
			 */
		}
}
}