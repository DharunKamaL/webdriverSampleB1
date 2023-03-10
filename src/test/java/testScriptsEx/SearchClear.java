package testScriptsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.cssSelector("input[id=searchBar]"));
		Thread.sleep(2000);
		boolean isDisp1 = driver.findElement(By.xpath("//a[@title='Clear text']")).isDisplayed();
		if(!isDisp1) {
			System.out.println("Text clear icon is hidden before entering the text");
		}
		WebElement search = driver.findElement(By.cssSelector("input[id=searchBar]"));
		search.sendKeys("automation");
		System.out.println("After entering the text:");
		Thread.sleep(2000);
		boolean isDisp2 = driver.findElement(By.xpath("//a[@title='Clear text']")).isDisplayed();
		Thread.sleep(2000);
		if(isDisp2) {
			driver.findElement(By.xpath("//a[@title='Clear text']")).click();
			System.out.println("Text clear icon is displayed and Text was cleared...");
		}
	}
}
