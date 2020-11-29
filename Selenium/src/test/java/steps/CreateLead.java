package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass {

	@When("click on crmsfa link")
	public void clickcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();


	}

	@When("click leads option")
	public void clickMylead() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@When("Click createlead option")
			public void clickCreateLead() {
				driver.findElementByLinkText("Create Lead").click();
			}
			

	@When("Enter the companyname as (.*)")
	public void enterCompanyName(String company) {

		driver.findElementById("createLeadForm_companyName").sendKeys(company);


		
		
	}
	@When("Enter the firstname as (.*)")
public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);		
	}
	
	@When("Enter the lastname as (.*)")
public void enterlastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);		
	}
	@Then("Click Createlead Button")
public void clickCreatelead() {
		driver.findElementByName("submitButton").click();
	}

	@Then("ViewLead page shouldbe appeared")
	public void viewLeadPage() {
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("Create lead is successfully created");
		}else {
			System.out.println("Create lead is not created");
		}
	}
	

	
	
}
