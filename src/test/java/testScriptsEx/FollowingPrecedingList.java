package testScriptsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingPrecedingList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog/");
		List<WebElement> items1 = driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[@id='menu-item-31219']//following-sibling::li"));
		int count = 1;
		System.out.println("Following list of Playwright testing:");
		for(WebElement itemlst1:items1) {
			System.out.println(count+"."+itemlst1.getText());
			count++;
		}
		driver.navigate().to("https://www.lambdatest.com/blog/");
		List<WebElement> items2 = driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[@id='menu-item-31219']//preceding-sibling::li"));
		int sum = 1;
		System.out.println("\nPreceding list of Playwright testing");
		for(WebElement itemlst2:items2) {
			System.out.println(sum+"."+itemlst2.getText());
			sum++;
		}
	}
}
