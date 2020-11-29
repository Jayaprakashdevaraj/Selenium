package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
//go to frame		
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
		
//comeback to mainwindow		
		driver.switchTo().defaultContent();
		String text = driver.findElementByTagName("h1").getText();
		System.out.println(text);
//nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElementById("Click1").click();
		
	}

}
