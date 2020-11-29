package week5.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "fetchdata")
	public  void createLead(String company,String fName,String lName) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
	}
	
	@DataProvider(name = "fetchdata")
	public String[][] data() {
		String[][] data = new String[2][3];
		data[0][0] = "Vernalis";
		data[0][1] = "jp";
		data[0][2] = "devaraj";
		data[1][0] = "Exela";
		data[1][1] = "jaya";
		data[1][2] = "prakash";

		return data;
	}

}
