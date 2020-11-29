package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");

		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();

		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.dismiss();

		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("Jp is a rockstar");
		alert.dismiss();

		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='OK']").click();
	}

}
