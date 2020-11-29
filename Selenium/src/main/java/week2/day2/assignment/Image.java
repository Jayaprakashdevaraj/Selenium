package week2.day2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.findElementByXPath("//input[@onclick='../images/home.png']").click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("home")) {
			System.out.println("navigate to home page");
		}else {
			System.out.println("it is not home page");
		}
		
		driver.navigate().back();
		
		
		
		
	}

}
