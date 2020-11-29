package week4.day1.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	
	List<WebElement> row = driver.findElementsByXPath("//table[@id='table_id']//tr");
	int rowCount = row.size();
	System.out.println("No of row is : "+rowCount);

	List<WebElement> column = driver.findElementsByXPath("//table[@id='table_id']//tr[1]/th");
	int columnCount = column.size();
	System.out.println("No of column is : "+columnCount);

	List<WebElement> progress = driver.findElementsByXPath("//table[@id='table_id']//tr[3]/th[2]");
	System.out.println("Progress value for lear to intracr element : "+progress);
	
	for (int i = 2; i < row.size(); i++) { 
		WebElement progres = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]");
			String value = progres.getText();
			String min = Collections.min(Arrays.asList(value));
			
			String attribute = progres.getAttribute("name");
			
		}
	
}
}
