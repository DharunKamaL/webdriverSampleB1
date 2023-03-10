package testScriptsEx;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
//		driver.findElement(By.cssSelector("button[id=\"details-button\"]")).click();
//		actions.scrollByAmount(0,1000).perform();
//		driver.findElement(By.partialLinkText("Proceed")).click();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.cssSelector("a[title=\"Follow @seleniumeasy on Twitter\"]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle:windowHandles) {
			if(!windowHandle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();
			}
		}
		//driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("a[title=\"Follow @seleniumeasy on Facebook\"]")).click();
	    //driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("followall")).click();
		//driver.close();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Tabs:"+tabs.size());
		driver.quit();
	}
}
