package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSActionsSelect {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	
	driver.switchTo().frame(0);
	WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
	WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
	WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
	
	Actions a =new Actions(driver);
	a.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();

}
}
