package steps;

import cucumber.api.java.en.When;

public class EditLead extends BaseClass {

	@When("Click FindLead option")

	public void clickFindBy() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@When("Click phone option in findby section")
	public void clickPhoneOption() {

		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@When("Enter phone number as (.*)")
	public void enterPhoneNo(String phoneNo) {

		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNo);

	}

	@When("Click findleads button in findby section")
	public void clickFindleads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

	}

	@When("Click lead in result section")
	public void clickUpdateLead() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	}

	@When("Click Edit button in leftside")
	public void clickeditButton() {
		driver.findElementByLinkText("Edit").click();

	}

	@When("change compant name as (.*)")
	public void updateCompanyName(String newCompany) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(newCompany);
	}

	@When("Click Update Button")
	public void clickUpdateButton() {
		driver.findElementByName("submitButton").click();
	}

}
