package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSWindowHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByXPath("//button[@type='submit']").click();
		driver.findElementByXPath("//li[@id='flight']//span[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listhandle = new ArrayList<String>(windowHandles);
		
		String reqWindow = listhandle.get(1);
	driver.switchTo().window(reqWindow);
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.switchTo().window(listhandle.get(0));
	
	driver.close();
	driver.switchTo().window(listhandle.get(1));
	
	
	}

}
