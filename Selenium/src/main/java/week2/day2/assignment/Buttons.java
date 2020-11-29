package week2.day2.assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

//Find position of button (x,y)
		Point location = driver.findElementById("position").getLocation();
		System.out.println("X axis is: " + location.getX());
		System.out.println("Y axis is: " + location.getY());

//Find button color
		WebElement color = driver.findElementById("color");
		System.out.println("Background color is : " + color.getCssValue("background-color"));
				

//Find the height and width		
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("hight is is: " + size.getHeight());
		System.out.println("width axis is: " + size.getWidth());

// Click button to travel home page
		WebElement home = driver.findElementById("home");
		home.click();
		System.out.println("Home page title is : " + driver.getTitle());

	}

}
