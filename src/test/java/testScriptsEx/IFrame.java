package testScriptsEx;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[@class=\"tox-icon tox-tbtn__icon-wrap\"])[3]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("body[id=\"tinymce\"]")).clear();
		driver.findElement(By.cssSelector("body[id=\"tinymce\"]")).sendKeys("This is the content...");
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("TINY")).click();
		Set<String> currentWindows = driver.getWindowHandles();
		for(String currentTab:currentWindows) {
			if(!currentTab.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(currentTab);
				driver.findElement(By.cssSelector("button[aria-label=\"Click or tap here to interact with the Solutions menu.\"]")).click();
			}
		}
	}
}

