package week6.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LearnTestNgAssertion {
	
	@Test
	public void createLead() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	String title = driver.getTitle();
//assert 1- hard
//	Assert.assertEquals(title, leaftab);
	
	boolean loginButton = driver.findElementByClassName("decorativeSubmit").isEnabled();

//assert 2- hard	
//	Assert.assertTrue(loginButton);
	SoftAssert soft = new SoftAssert();
	
	soft.assertEquals(title, "Leaf tab");
	soft.assertTrue(loginButton);
	soft.assertAll();
	
	}
}
