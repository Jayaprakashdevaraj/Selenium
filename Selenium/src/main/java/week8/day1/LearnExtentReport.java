package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	
	public static void main(String[] args) throws IOException {

	
	// create the physical HTML report
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/results.html");
	
	// to maintain the execution history
	reporter.setAppendExisting(true);
	
	// create actual report
	ExtentReports extent = new ExtentReports();
	
	//attach the physicalreport to actual report data
	extent.attachReporter(reporter);
	
	//create testcases with details
	ExtentTest testcase1 = extent.createTest("LoginAndLogout","Tc to validate login functionality");
	testcase1.assignAuthor("hari");
	testcase1.assignCategory("smoke");
	
	//test step status--------MediaEntityBu using screenshotilder
	testcase1.pass("username as demosalesmanager is success", MediaEntityBuilder.createScreenCaptureFromPath(".././src/snap/leaftab.png").build());
	testcase1.pass("password as crmsfa is success");
	testcase1.pass("Login button clicked success");
	
	// generate the report with all steps
	extent.flush();
	
	}
}
