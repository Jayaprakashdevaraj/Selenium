package week2.day2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement email = driver.findElementById("email");
		System.out.println("Email field is display : "+email.isDisplayed());
		System.out.println("Email field is Enabled : "+email.isEnabled());
		email.sendKeys("jayaprakash1803@gmail.com");
		
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Additional text");
		
		WebElement defaultValue = driver.findElementByName("username");
		System.out.println(defaultValue.getAttribute("value"));

		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		WebElement diableField = driver.findElementByXPath("(//input[@type='text'])[5]");
		System.out.println("disabled field is Enable : "+diableField.isEnabled());
	}

}
