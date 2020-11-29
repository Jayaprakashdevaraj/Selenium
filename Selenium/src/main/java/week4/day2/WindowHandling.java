package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementById("home").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listhandle = new ArrayList<String>(windowHandles);
		
		String reqWindow = listhandle.get(1);
	driver.switchTo().window(reqWindow);
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	
	
	}

}
