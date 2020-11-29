package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSWebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		WebElement fromstation = driver.findElementById("txtStationFrom");
		fromstation.clear();
		fromstation.sendKeys("MS");

		fromstation.sendKeys(Keys.TAB);

		WebElement tostation = driver.findElementById("txtStationTo");
		tostation.clear();
		tostation.sendKeys("CBE");
		Thread.sleep(2000);
		tostation.sendKeys(Keys.TAB);

		driver.findElementById("chkSelectDateOnly").click();

		Thread.sleep(2000);

		List<String> trainName = new ArrayList<String>();

		int rowCount = driver.findElementsByXPath("//table[contains(@class,'DataTable TrainList')]//tr").size();

		for (int i = 1; i <= rowCount; i++) {
			String text = driver
					.findElementByXPath("//table[contains(@class,'DataTable TrainList')]//tr[" + i + "]/td[2]")
					.getText();
			trainName.add(text);

		}
		int size = trainName.size();
		Set<String> setTrainName = new LinkedHashSet<String>(trainName);
		int size2 = setTrainName.size();

		if (size == size2) {
			System.out.println("no duplicate");
		} else {
			System.out.println("duplicate present");
		}

	}

}
