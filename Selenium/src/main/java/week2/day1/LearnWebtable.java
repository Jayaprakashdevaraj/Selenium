package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebtable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

// get sinle value in particular row		
		String text = driver.findElementByXPath("//table[@id='table_id']//tr[2]/td").getText();
		System.out.println(text);

// get all colow values in particulat column		
		for (int i = 2; i < 5; i++) {
			String text2 = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td").getText();
			System.out.println(text2);
		}
		// other method dynamic

		int row = driver.findElementsByXPath("//table[@id='table_id']//tr").size();
		
		
		for (int i = 2; i <= row; i++) {
			String text3 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td").getText();
			System.out.println(text3);
		}
//other method
	
		for (int i = 2; i <= row; i++) {
			String text3 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td").getText();
			System.out.println(text3);
		}
		
		int cell = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td").size();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
