package week2.day2.assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		//go to home page		
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Homepage name :"+ driver.getTitle());
		driver.navigate().back();
		System.out.println("Page name :"+ driver.getTitle());
		
		
//Find where am supposed to go without clicking me?
		String withoutClickingURL = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println("where am supposed to go without clicking : "+withoutClickingURL);
		
		
// is broken
		WebElement broken = driver.findElementByLinkText("Verify am I broken?");
		String url = broken.getAttribute("href");
		
		if(url.contains("error")){
			System.out.println("it is broken URL");
		}else
			System.out.println("not broken");

		
//go to home page		
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Homepage name :"+ driver.getTitle());
		driver.navigate().back();
		System.out.println("Page name :"+ driver.getTitle());		
		
		
// no of links in the page
		List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println("no of links in the page : "+links.size());
		
		
		



	}

}
