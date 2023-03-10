package testScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File scr = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("F:\\Dharun\\Screenshot\\Fullscreen.png"));
		
		WebElement menu = driver.findElement(By.xpath("//li/a[contains(text(),'Components')]"));
		WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
		//actions.moveToElement(menu).click(submenu).build().perform();
		
		actions.moveToElement(menu).perform();
		actions.click(submenu).perform();
		
		actions.scrollByAmount(10, 500).perform();
		//driver.findElement(By.partialLinkText("Apple Cinema")).click();
		driver.findElement(By.partialLinkText("Apple Cinema1")).click();
		
		WebElement searchBox = driver.findElement(By.cssSelector("input[name=search]"));
		actions.contextClick(searchBox).perform();
		
		TakesScreenshot screen2 = (TakesScreenshot)driver;
		File scr2 = screen2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr2,new File("F:\\Dharun\\Screenshot\\screenshot2.jpeg"));
		Thread.sleep(1000);
		actions.scrollByAmount(10,400).perform();
	}
}
