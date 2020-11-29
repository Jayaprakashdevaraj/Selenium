package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntractMultipleElememt {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		

		List<WebElement> inputLogin = driver.findElementsByClassName("inputLogin");
		
		for (WebElement webElement : inputLogin) {
			
			System.out.println(webElement.getAttribute("id"));
			
		}


}
}