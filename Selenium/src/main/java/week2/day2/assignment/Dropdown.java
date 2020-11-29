package week2.day2.assignment;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement indexSelect = driver.findElementById("dropdown1");
		Select index = new Select(indexSelect);
		index.selectByIndex(1);
		
		
		WebElement textSelect = driver.findElementByName("dropdown2");
		Select text = new Select(textSelect);
		text.selectByVisibleText("Appium");
		
		WebElement valueSelect = driver.findElementById("dropdown3");
		Select value = new Select(valueSelect);
		value.selectByValue("2");
		
		WebElement noOfOptions = driver.findElementByClassName("dropdown");
		Select options = new Select(noOfOptions);
		List<WebElement> size = options.getOptions();
		System.out.println(size);
		
		driver.findElementByXPath("//option[Contains[text(),'You can also use sendKeys to select']").sendKeys("Loadrunner");


	}

}
