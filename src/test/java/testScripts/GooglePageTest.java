package testScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
	//	searchBox.sendKeys(Keys.ENTER);
		System.out.println("Page Title:"+driver.getTitle());
		driver.navigate().back();
		System.out.println("Current URL:"+driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.selenium.dev/");
	}
}
