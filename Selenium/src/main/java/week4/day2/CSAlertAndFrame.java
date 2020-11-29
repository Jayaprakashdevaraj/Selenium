package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSAlertAndFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
//go to frame		
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text() = 'Try it']").click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("Jp");
		alert.accept();
		String text = driver.findElementById("demo").getText();
		if(text.contains("Jp")) {
			System.out.println("Name is present");
		}else {
			System.out.println("Name is not present");
		}
	
	
	}
	

}
