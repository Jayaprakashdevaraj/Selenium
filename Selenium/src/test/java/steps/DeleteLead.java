package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteLead extends BaseClass{
public String leadID;
	
	@When("Select the particular lead ID and click it")
	public void selectLeadWithDetails() {
		leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println(leadID);
	}
	
	@When("Click delete button in left side")
public void clickDelete() {
		driver.findElementByLinkText("Delete").click();	
	}
	@When("enter the deleted lead ID in LeadID text field")
	public void enterDeletedleadID() {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	}
	

	@Then("deleted lead should not present")
	public void checkDeletedLeadInResult() {
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}
