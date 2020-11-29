package week4.day1.assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropInsert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");		
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		Point location = item4.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions a =new Actions(driver);
		a.dragAndDropBy(item1, x, y).perform();

	}

}
