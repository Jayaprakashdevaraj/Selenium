package week8.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Features {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.xpath("//label[text()='Username']"))).sendKeys("demosalesmanager");
		
// switch to new window
		driver.switchTo().newWindow(WindowType.TAB).get("https://twitter.com");

// minimized option presents selenium 4		
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		driver.close();
	}
}
