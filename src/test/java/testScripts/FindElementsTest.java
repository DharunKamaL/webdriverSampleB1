package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		List<WebElement> items = driver.findElements(By.xpath("//h2[starts-with(@id,'pid')]"));
		for(WebElement item:items) {
			System.out.println("Books are:"+item.getText());
			System.out.println("Id value:"+item.getAttribute("id"));
//			if(item.getText().equalsIgnoreCase("Agile Testing")) {
//				item.click();
//			}
		}
	}
}
