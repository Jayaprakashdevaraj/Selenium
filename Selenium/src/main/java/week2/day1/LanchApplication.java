package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanchApplication {

	public static void main(String[] args) {
		
		//WebDriverManager= dependancy used to download right version of browser driver automatically
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//load application url
		driver.get("http://leaftaps.com/opentaps/control/main");
			
		//maximize browse
		driver.manage().window().maximize();
		
		driver.close();
		}

}
