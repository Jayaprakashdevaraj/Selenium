package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSActionHover {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
// disable notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		WebElement men = driver.findElementByLinkText("Men's Fashion");
		Thread.sleep(2000);
		Actions a =new Actions(driver);
		a.moveToElement(men).perform();
		driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		
		WebElement first = driver.findElementByXPath("//span[contains(@id,'display-price')]");
						   
		a.moveToElement(first).perform();
		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();

		
	}

}
