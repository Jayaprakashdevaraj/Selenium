package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://myntra.com");
		WebElement men = driver.findElementByXPath("//a[text()='Men']");
	
		Actions a = new Actions(driver);
//mousehover
		a.moveToElement(men).perform();
//rightclick
		a.contextClick(men).perform();
		
		
	}

}
