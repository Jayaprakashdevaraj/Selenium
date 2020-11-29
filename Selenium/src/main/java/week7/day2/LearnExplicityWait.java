package week7.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicityWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//exp wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//given condition to wait
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
		driver.findElementById("btn").click();
	}

}
