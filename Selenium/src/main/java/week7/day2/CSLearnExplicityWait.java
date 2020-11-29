package week7.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSLearnExplicityWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/disapper.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement disapperedElement = driver.findElementByXPath("//*[contains(text(),'I know you can do it')]");
		
		//exp wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//given condition to wait
		wait.until(ExpectedConditions.invisibilityOf(disapperedElement));

		String text = driver.findElementByXPath("//div[@id='show']//strong").getText();		
		System.out.println(text);
	}

}
